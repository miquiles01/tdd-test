import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;


public class PrezadosTest {
    @Test

public void req05() {

String[] nomes = {"Ana", "Bruno", "Carlos"};

String resultado = Prezados.saudacao(nomes);

assertEquals("Olá, Ana, Bruno, e Carlos!", resultado);

}
}
