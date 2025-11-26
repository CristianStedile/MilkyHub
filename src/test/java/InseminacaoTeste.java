import br.udesc.entidades.Animal;
import br.udesc.entidades.Inseminacao;
import br.udesc.repositorio.RepositorioInseminacaoStub;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InseminacaoTeste {
    //Roteiro 04
    //CT 01
    @Test
    public void deveGravarInseminacao() {
        //Arrange
        Animal animal = new Animal(151187, "22/10/2013", "Jersey", "femea");
        Inseminacao inseminacao = new Inseminacao(animal, "Touro A", "21/10/2025");

        //Stub
        RepositorioInseminacaoStub bancoDados = new RepositorioInseminacaoStub();


        //Act
        boolean resultado = bancoDados.gravarInseminacao(inseminacao);

        //Assert
        Assertions.assertTrue(resultado);
    }

    //CT 02
    @Test
    public void validarDataFutura() {
        //Arrange
        Animal animal = new Animal(151187, "22/10/2013", "Jersey", "femea");
        Inseminacao inseminacao = new Inseminacao(animal, "Touro A", "21/10/2026");

        //Stub
        RepositorioInseminacaoStub bancoDados = new RepositorioInseminacaoStub();


        //Act
        boolean resultado = bancoDados.gravarInseminacao(inseminacao);

        //Assert
        Assertions.assertFalse(resultado);
    }

    //CT 03
    @Test
    public void validarSemenVazio() {
        //Arrange
        Animal animal = new Animal(151187, "22/10/2013", "Jersey", "femea");
        Inseminacao inseminacao = new Inseminacao(animal, "", "21/10/2026");

        //Stub
        RepositorioInseminacaoStub bancoDados = new RepositorioInseminacaoStub();


        //Act
        boolean resultado = bancoDados.gravarInseminacao(inseminacao);

        //Assert
        Assertions.assertFalse(resultado);
    }

    //Testes de Integração
    //Roteiro 07
    //CT 01
    @Test
    public void validarInseminacaoEmMacho() {
        //Arrange
        Animal animal = new Animal(151187, "22/10/2013", "Jersey", "macho");
        Inseminacao inseminacao = new Inseminacao(animal, "Touro B", "21/10/2026");

        //Stub
        RepositorioInseminacaoStub bancoDados = new RepositorioInseminacaoStub();


        //Act
        boolean resultado = bancoDados.gravarInseminacao(inseminacao);

        //Assert
        Assertions.assertFalse(resultado);
    }
}
