import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;

public class QueridasTest {
    @Test

public void req04() {

String[] nomes = {"Maria", "Laura"};

String resultado = Queridas.saudacao(nomes);

assertEquals("Olá, Maria e Laura!", resultado);
}
}
