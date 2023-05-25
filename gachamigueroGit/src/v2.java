public class v2 {
    public static String cocinar(int i) {
        String salida ;
        if (i % 3 == 0 && i % 5 == 0)
            salida = "Gachamiga";
        else if (i%5 == 0)
            salida = "Miga" ;
        else if (i%3==0)
            salida = "Gacha";
        else
            salida = i + "";
        return salida;
    }
}

