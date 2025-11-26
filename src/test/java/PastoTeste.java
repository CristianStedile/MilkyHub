import br.udesc.entidades.Animal;
import br.udesc.entidades.Pasto;
import br.udesc.entidades.PesoLeite;
import br.udesc.repositorio.RepositorioPastoStub;
import br.udesc.repositorio.RepositorioPesoLeiteStub;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PastoTeste{
    //Roteiro 05
    //CT 01
    @Test
    public void validarCampoNome() {
        //Arrange
        Pasto pasto = new Pasto("", "Pioneiro");

        //Stub
        RepositorioPastoStub bancoDados = new RepositorioPastoStub();


        //Act
        boolean resultado = bancoDados.gravarPasto(pasto);

        //Assert
        Assertions.assertFalse(resultado);
    }

    //CT 02
    @Test
    public void validarCampoTipoGrama() {
        //Arrange
        Pasto pasto = new Pasto("Pasto 1", "");

        //Stub
        RepositorioPastoStub bancoDados = new RepositorioPastoStub();


        //Act
        boolean resultado = bancoDados.gravarPasto(pasto);

        //Assert
        Assertions.assertFalse(resultado);
    }

    //Roteiro 06
    //CT 01
    @Test
    public void deveRocar() throws ParseException {
        //Arrange
        Pasto pasto = new Pasto("Pasto 1", "Pioneiro");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date data = sdf.parse("25/11/2025");

        //Stub
        RepositorioPastoStub bancoDados = new RepositorioPastoStub();


        //Act
        boolean resultado = pasto.rocar(data);

        //Assert
        Assertions.assertTrue(resultado);
    }

    //CT 02
    @Test
    public void validaRocadaSemData() throws ParseException {
        //Arrange
        Pasto pasto = new Pasto("Pasto 1", "Pioneiro");
        Date data = null;

        //Stub
        RepositorioPastoStub bancoDados = new RepositorioPastoStub();


        //Act
        boolean resultado = pasto.rocar(data);

        //Assert
        Assertions.assertFalse(resultado);
    }
}
