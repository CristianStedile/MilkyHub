import br.udesc.entidades.Animal;
import br.udesc.entidades.AplicacaoMedicacao;
import br.udesc.entidades.Medicacao;
import br.udesc.repositorio.RepositorioAplicacaoMedicacaoStub;
import br.udesc.repositorio.RepositorioLeiteVendidoStub;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AplicacaoMedicacaoTeste {

    //Roteiro 06
    //CT 01
    @Test
    public void listarAplicacaoPorNumero() {
        //Arrange
        Animal animal = new Animal(151187, "22/12/2004", "Jersey", "fêmea");
        Medicacao medicacao = new Medicacao(1, "Hepaxotan", "1ml para 50kg", 20);
        AplicacaoMedicacao aplicacaoMedicacao = new AplicacaoMedicacao("22/12/2004", animal, medicacao);

        //Stub
        RepositorioAplicacaoMedicacaoStub bancoDados = new RepositorioAplicacaoMedicacaoStub();


        //Act
        bancoDados.gravarAplicacao(aplicacaoMedicacao);

        //Assert
        Assertions.assertEquals(bancoDados.listarAplicacaoMedicacaoFiltradas(151187).size(), 1);
        System.out.println(bancoDados.listarAplicacaoMedicacaoFiltradas(151187).toString());
    }

    //CT02
    @Test
    public void filtrarSemRegistros() {
        //Arrange

        //Stub
        RepositorioAplicacaoMedicacaoStub bancoDados = new RepositorioAplicacaoMedicacaoStub();


        //Act

        //Assert
        Assertions.assertEquals(bancoDados.listarAplicacoes().size(), 0);
    }
}
