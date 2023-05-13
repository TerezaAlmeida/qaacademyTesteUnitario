package teste_unitario;

import org.junit.Assert;
import org.junit.Test;

public class Test_ex01_casa {
    @Test
    public void validaDivisaoPorDois(){
        Assert.assertTrue(Ex01Casa.eDivisivelPorDois(20));;
    }
}
