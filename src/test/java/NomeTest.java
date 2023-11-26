import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;


public class NomeTest {
    @Test

public void req03() {

String resultado = Nome.saudacao("JOSE");

assertEquals("OLÁ, JOSE!", resultado);

}
}
