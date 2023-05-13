package teste_unitario;

import org.junit.Assert;
import org.junit.Test;

public class Test_ex02_casa {
    @Test
    public void validaTamVetor(){
        Assert.assertEquals( 5, Ex02Casa.tamVetor());
        Assert.assertNotEquals(5,Ex02Casa.tamVetor());
    }
}
