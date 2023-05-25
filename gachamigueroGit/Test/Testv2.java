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
    @Test
    public void test4(){
        String result=v2.cocinar(4);
        Assertions.assertEquals("4",result);
    }
    @Test
    public void test5(){
        String result=v2.cocinar(5);
        Assertions.assertEquals("Miga",result);
    }
    @Test
    public void test6(){
        String result=v2.cocinar(6);
        Assertions.assertEquals("Gacha",result);
    }
    @Test
    public void test7(){
        String result=v2.cocinar(7);
        Assertions.assertEquals("7",result);
    }
    @Test
    public void test8(){
        String result=v2.cocinar(8);
        Assertions.assertEquals("8",result);
    }
    @Test
    public void test9(){
        String result=v2.cocinar(9);
        Assertions.assertEquals("Gacha",result);
    }
    @Test
    public void test10(){
        String result=v2.cocinar(10);
        Assertions.assertEquals("Miga",result);
    }
    @Test
    public void test11(){
        String result=v2.cocinar(11);
        Assertions.assertEquals("11",result);
    }
}
