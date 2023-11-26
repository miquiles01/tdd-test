import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;


public class FriendTest {
    @Test

public void req08() {

String[] nomes = {"Joao", "\"Marcos, Daiane\""};

String resultado = Friend.saudacao(nomes);

assertEquals("Olá, Joao e Marcos e Daiane!", resultado);

}
}
