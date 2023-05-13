package teste_unitario;

import org.junit.Test;
import org.junit.Assert;

public class Test_ex01 {
    @Test
    public void validaPalavra(){
        Assert.assertEquals("bom dia",Ex01.retornaPalavra());
    }
    @Test
    public void validaPalavraIncorreta(){
        Assert.assertNotEquals("não",Ex01.retornaPalavra());
    }
    @Test
    public void cpfComDigitosCorretos(){
        Assert.assertTrue(Ex01.inserirCPF());
    }
}
