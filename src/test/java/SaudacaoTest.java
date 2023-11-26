import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;

public class SaudacaoTest {
    @Test
    public void req01()
    {
        String resultado = Saudacao.saudacao("Joao");

            assertEquals("Olá, Joao!", resultado);
        
    }

}

