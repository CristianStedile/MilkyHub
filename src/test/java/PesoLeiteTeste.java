import br.udesc.entidades.Animal;
import br.udesc.entidades.PesoLeite;
import br.udesc.repositorio.RepositorioPesoLeiteStub;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PesoLeiteTeste {

    //Roteiro 02
    //CT 01
    @Test
    public void deveCriarPesagem() {
        //Arrange
        Animal animal = new Animal(151187, "22/10/2014", "Jersey", "fêmea");
        PesoLeite pesagem = new PesoLeite(20.4, "21/10/2024", animal);

        //Stub
        RepositorioPesoLeiteStub bancoDados = new RepositorioPesoLeiteStub();


        //Act
        boolean resultado = bancoDados.gravarPesagem(pesagem);

        //Assert
        Assertions.assertTrue(resultado);
    }

    //CT 02
    @Test
    public void validarDataPesagem() {
        //Arrange
        Animal animal = new Animal(151187, "22/10/2014", "Jersey", "fêmea");
        PesoLeite pesagem = new PesoLeite(20.4, "21/10/2060", animal);

        //Stub
        RepositorioPesoLeiteStub bancoDados = new RepositorioPesoLeiteStub();


        //Act
        boolean resultado = bancoDados.gravarPesagem(pesagem);

        //Assert
        Assertions.assertFalse(resultado);
    }

    //CT 03
    @Test
    public void validarAnimalSelecionadoNaPesagem() {
        //Arrange
        Animal animal = null;
        PesoLeite pesagem = new PesoLeite(20.4, "21/10/2060", animal);

        //Stub
        RepositorioPesoLeiteStub bancoDados = new RepositorioPesoLeiteStub();


        //Act
        boolean resultado = bancoDados.gravarPesagem(pesagem);

        //Assert
        Assertions.assertFalse(resultado);
    }

    //CT 04
    @Test
    public void validarPesoNegativo() {
        //Arrange
        Animal animal = new Animal(151187, "22/10/2014", "Jersey", "fêmea");
        PesoLeite peso = new PesoLeite(-2, "21/10/2022", animal);

        //Stub
        RepositorioPesoLeiteStub bancoDados = new RepositorioPesoLeiteStub();


        //Act
        boolean resultado = bancoDados.gravarPesagem(peso);

        //Assert
        Assertions.assertFalse(resultado);
    }

    //CT 05
    @Test
    public void deveCriarPesagemComPeso30() {
        //Arrange
        Animal animal = new Animal(151187, "22/10/2014", "Jersey", "fêmea");
        PesoLeite pesagem = new PesoLeite(33, "21/10/2022", animal);

        //Stub
        RepositorioPesoLeiteStub bancoDados = new RepositorioPesoLeiteStub();


        //Act
        boolean resultado = bancoDados.gravarPesagem(pesagem);

        //Assert
        Assertions.assertEquals(pesagem.getPesagemLeite(), 30);
        Assertions.assertTrue(resultado);
    }
}
