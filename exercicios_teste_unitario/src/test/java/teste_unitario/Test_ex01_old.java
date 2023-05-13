package teste_unitario;

import org.junit.Assert;
import org.junit.Test;

public class Test_ex01_old {
    @Test
    public void validaPalavra(){
       Assert.assertEquals("curso",Ex01_old.retornaPalavra());
    }
}
