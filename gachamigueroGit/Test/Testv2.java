import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Testv2 {
    @Test

    public void test1(){
        String result=v2.cocinar(1);
        Assertions.assertEquals("1",result);
    }
    @Test
    public void test2(){
        String result=v2.cocinar(2);
        Assertions.assertEquals("2",result);
    }
    @Test
    public void test3(){
        String result=v2.cocinar(3);
        Assertions.assertEquals("Gacha",result);
    }
}
