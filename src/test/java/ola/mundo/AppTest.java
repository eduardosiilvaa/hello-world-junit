package ola.mundo;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void testMensagem() {
        String mensagem = "Olá, mundo!";
        assertEquals("Olá, mundo!", mensagem);
    }
}
