package teste_unitario;

import org.junit.Assert;
import org.junit.Test;

public class Test_ex03_casa {

    @Test
    public void validaTexto(){
       // Assert.assertEquals("sabado", Ex03Casa.obtemTexto());
        Assert.assertNotEquals("sabado", Ex03Casa.obtemTexto());
    }
}
    
