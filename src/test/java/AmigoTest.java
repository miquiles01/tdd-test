import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;

public class AmigoTest {
    @Test
    public void req02()
    {
        String resultado = Amigo.saudacao("Joao");

            assertEquals("Olá, meu amigo", resultado);
        
    }

}
