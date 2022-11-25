import java.util.Scanner;

public class daireAlanCevre {
    public static void main(String[] args) {

        double r ,alan , pi=3.14 , cevre , alf ;

    Scanner oku = new Scanner(System.in);
        System.out.print("Daire yarı çapı : ");
        r = oku.nextInt();
        System.out.print("Merkez Açı : ");
        alf  = oku.nextInt();
        alan = ((r*r)*pi*alf)/360;
        System.out.print("Daire diliminin Alanı : ");
        System.out.println(alan);


    }
}
