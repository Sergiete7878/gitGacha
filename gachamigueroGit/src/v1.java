import java.util.Scanner;
public class v1 {
    public static void main(String[] args){
        int n1;
        Scanner sc =new Scanner(System.in);
        for ( int i=1 ;i<101;i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("Gachamiga");
            } else if ( i % 5 == 0) {
                System.out.println("Miga");
            } else if (i % 3 == 0){
               System.out.println("Gaha");
            } else {
                System.out.println(i);
            }
        }
    }
}
