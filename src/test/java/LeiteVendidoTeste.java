import br.udesc.entidades.LeiteVendido;
import br.udesc.repositorio.RepositorioInseminacaoStub;
import br.udesc.repositorio.RepositorioLeiteVendidoStub;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeiteVendidoTeste {
    //Roteiro 05
    //CT 01
    @Test
    public void filtrarComRegistros() {
        //Arrange
        LeiteVendido vendaA = new LeiteVendido(10, "15/10/2025");
        LeiteVendido vendaB = new LeiteVendido(15, "20/10/2025");
        LeiteVendido vendaC = new LeiteVendido(5, "05/11/2025");

        //Stub
        RepositorioLeiteVendidoStub bancoDados = new RepositorioLeiteVendidoStub();


        //Act
        bancoDados.gravarVenda(vendaA);
        bancoDados.gravarVenda(vendaB);
        bancoDados.gravarVenda(vendaC);

        //Assert
        Assertions.assertEquals(bancoDados.listarVendasFiltradas("10/2025").size(), 2);
        System.out.println(bancoDados.listarVendasFiltradas("10/2025").toString());;
    }

    //CT02
    @Test
    public void filtrarSemRegistros() {
        //Arrange

        //Stub
        RepositorioLeiteVendidoStub bancoDados = new RepositorioLeiteVendidoStub();


        //Act

        //Assert
        Assertions.assertEquals(bancoDados.listarVendasFiltradas("10/2025").size(), 0);
    }
}
