import br.udesc.entidades.Animal;
import br.udesc.entidades.Medicacao;
import br.udesc.repositorio.RepositorioAnimalStub;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MedicacaoTeste {

    //Roteiro 03
    //CT 01
    @Test
    public void deveAtualizarEstoque(){
        //Arrange
        Medicacao med = new Medicacao(1, "Hepaxotan", "1 ml para 50kg", 0);

        //Act
        med.atualizarEstoque(50);

        //Assert
        Assertions.assertEquals(med.getEstoque(), 50);
    }

    //CT 02
    @Test
    public void atualizarEstoqueComNumeroNegativo(){
        //Arrange
        Medicacao med = new Medicacao(1, "Hepaxotan", "1 ml para 50kg", 1);

        //Act
        boolean res = med.atualizarEstoque(-2);

        //Assert
        Assertions.assertEquals(med.getEstoque(), 1);
        Assertions.assertFalse(res);
    }


}
