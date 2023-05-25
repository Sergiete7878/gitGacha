import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_Gachamiguero {
    @Test
    public void test1gach(){
        String result=Gachamiguero.catar(1);
        Assertions.assertEquals("1",result);
    }
    @Test
    public void test2gach(){
        String result=Gachamiguero.catar(2);
        Assertions.assertEquals("2",result);
    }
    @Test
    public void test3gach(){
        String result=Gachamiguero.catar(3);
        Assertions.assertEquals("Gacha",result);
    }
    @Test
    public void test4gach(){
        String result=Gachamiguero.catar(4);
        Assertions.assertEquals("4",result);
    }
    @Test
    public void test5gach(){
        String result=Gachamiguero.catar(5);
        Assertions.assertEquals("Miga",result);
    }
    @Test
    public void test6gach(){
        String result=Gachamiguero.catar(6);
        Assertions.assertEquals("Gacha",result);
    }
    @Test
    public void test7gach(){
        String result=Gachamiguero.catar(7);
        Assertions.assertEquals("7",result);
    }
    @Test
    public void test8gach(){
        String result=Gachamiguero.catar(8);
        Assertions.assertEquals("8",result);
    }
    @Test
    public void test9gach(){
        String result=Gachamiguero.catar(9);
        Assertions.assertEquals("Gacha",result);
    }
    @Test
    public void test10gach(){
        String result=Gachamiguero.catar(10);
        Assertions.assertEquals("Miga",result);
    }
    @Test
    public void test11gach(){
        String result=Gachamiguero.catar(11);
        Assertions.assertEquals("11",result);
    }
    @Test
    public void test12gach(){
        String result=Gachamiguero.catar(12);
        Assertions.assertEquals("Gacha",result);
    }
    @Test
    public void test13gach(){
        String result=Gachamiguero.catar(13);
        Assertions.assertEquals("13",result);
    }
    @Test
    public void test14gach(){
        String result=Gachamiguero.catar(14);
        Assertions.assertEquals("14",result);
    }
    @Test
    public void test15gach(){
        String result=Gachamiguero.catar(15);
        Assertions.assertEquals("Gachamiga",result);
    }
    @Test
    public void test30gach(){
        String result=Gachamiguero.catar(30);
        Assertions.assertEquals("Gachamiga",result);
    }
}
