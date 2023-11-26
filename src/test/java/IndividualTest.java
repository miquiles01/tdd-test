import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;

public class IndividualTest {
    @Test

public void req06() {

String[] nomes = {"Ana", "BRUNO", "Carlos"};

String resultado = Individual.saudacao(nomes);

assertEquals("Olá, Ana e Carlos. E OLÁ BRUNO!", resultado);

}
}
