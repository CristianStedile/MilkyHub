import br.udesc.entidades.Animal;
import br.udesc.repositorio.RepositorioAnimalStub;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AnimalTeste {
    //Testes Unitários
    //Roteiro 01
    //CT 01
    @Test
    public void deveCriarAnimal() {
            //Arrange
            Animal animal = new Animal(151187, "22/10/2014", "Jersey", "fêmea");

            //Stub
            RepositorioAnimalStub bancoDados = new RepositorioAnimalStub();


            //Act
            boolean resultado = bancoDados.gravarAnimal(animal);

            //Assert
            Assertions.assertTrue(resultado);
    }

    //CT 02
    @Test
    public void validarNumeroForaDoLimite() {
        //Arrange
        Animal animal = new Animal(15118777, "22/10/2013", "Jersey", "macho");

        //Stub
        RepositorioAnimalStub bancoDados = new RepositorioAnimalStub();


        //Act
        boolean resultado = bancoDados.gravarAnimal(animal);

        //Assert
        Assertions.assertFalse(resultado);
    }

    //CT 03
    @Test
    public void validarSexoValido() {
        //Arrange
        Animal animal = new Animal(151187, "22/10/2013", "Jersey", "mulher");

        //Stub
        RepositorioAnimalStub bancoDados = new RepositorioAnimalStub();


        //Act
        boolean resultado = bancoDados.gravarAnimal(animal);

        //Assert
        Assertions.assertFalse(resultado);
    }

    //CT 04
    @Test
    public void validarRacaValida() {
        //Arrange
        Animal animal = new Animal(156118, "22/10/2012", "", "macho");

        //Stub
        RepositorioAnimalStub bancoDados = new RepositorioAnimalStub();


        //Act
        boolean resultado = bancoDados.gravarAnimal(animal);

        //Assert
        Assertions.assertFalse(resultado);
    }

    //CT 05
    @Test
    public void validarDataNascValida() {
        //Arrange
        Animal animal = new Animal(157118, "22/12/2050", "Jersey", "macho");

        //Stub
        RepositorioAnimalStub bancoDados = new RepositorioAnimalStub();


        //Act
        boolean resultado = bancoDados.gravarAnimal(animal);

        //Assert
        Assertions.assertFalse(resultado);
    }

    //Testes de Integração
    //Roteiro 01
    //CT 01
    @Test
    public void consultarAnimais() {
        //Arrange
        Animal a1 = new Animal(151187, "22/10/2014", "Jersey", "fêmea");
        Animal a2 = new Animal(151185, "22/12/2012", "Jersey", "macho");

        //Stub
        RepositorioAnimalStub bancoDados = new RepositorioAnimalStub();


        //Act
        bancoDados.gravarAnimal(a1);
        bancoDados.gravarAnimal(a2);

        //Assert
        Assertions.assertEquals(bancoDados.listarAnimais().size(), 2);
    }

    //Roteiro 02
    //CT 01
    @Test
    public void excluirAnimal() {
        //Arrange
        Animal a1 = new Animal(151187, "22/10/2014", "Jersey", "fêmea");

        //Stub
        RepositorioAnimalStub bancoDados = new RepositorioAnimalStub();


        //Act
        bancoDados.gravarAnimal(a1);

        //Assert
        Assertions.assertTrue(bancoDados.excluirAnimal(a1));
        Assertions.assertEquals(bancoDados.listarAnimais().size(), 0);
    }

    //Roteiro 03
    //CT 01
    @Test
    public void baixarAnimal() {
        //Arrange
        Animal a1 = new Animal(151187, "22/10/2014", "Jersey", "fêmea");

        //Stub
        RepositorioAnimalStub bancoDados = new RepositorioAnimalStub();


        //Act
        bancoDados.gravarAnimal(a1);

        //Assert
        Assertions.assertTrue(bancoDados.baixarAnimal(a1));
        Assertions.assertEquals(bancoDados.listarAnimaisBaixados().size(), 1);
    }

    //Roteiro 04
    //CT 01
    @Test
    public void consultarAnimaisBaixados() {
        //Arrange
        Animal a1 = new Animal(151190, "22/10/2010", "Jersey", "fêmea");
        Animal a2 = new Animal(257480, "22/10/2020", "Jersey", "macho");

        //Stub
        RepositorioAnimalStub bancoDados = new RepositorioAnimalStub();

        //Act
        a1.setBaixado(true);
        a2.setBaixado(true);
        bancoDados.gravarAnimal(a1);
        bancoDados.gravarAnimal(a2);

        //Assert
        Assertions.assertEquals(bancoDados.listarAnimaisBaixados().size(), 2);
    }

}
