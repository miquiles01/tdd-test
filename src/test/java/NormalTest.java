import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;


public class NormalTest {
    @Test

public void req07() {

String[] nomes = {"Joao", "Marcos, Daiane"};

String resultado = Normal.saudacao(nomes);

assertEquals("Olá, Joao, Marcos, e Daiane!", resultado);

}
}
