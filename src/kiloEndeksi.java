import java.util.Scanner;

public class kiloEndeksi {
    public static void main(String[] args) {

        double kilo,boy  ;
        Scanner oku = new Scanner(System.in);

        System.out.print("Kilonuz : ");
        kilo = oku.nextDouble();

        System.out.print("Boyunuz(metre cininden) : ");
        boy = oku.nextDouble();

        double endeks = (boy*boy/kilo);
        System.out.println(endeks);


    }
}
