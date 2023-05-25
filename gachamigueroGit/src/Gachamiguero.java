public class Gachamiguero {
    public static String catar(int ingrediente) {
        String salida = ingrediente + "";
        if (ingrediente % 3 == 0 && ingrediente % 5 == 0)
            salida = "Gachamiga";
        else if (ingrediente % 5 == 0)
            salida = "Miga";
        else if (ingrediente % 3 == 0)
            salida = "Gacha";
        return salida;
    }
}
