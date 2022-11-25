import java.util.Scanner;

public class hipotenus {
    public static void main(String[] args) {
        int a , b , c ;

        Scanner oku = new Scanner(System.in) ;
        System.out.print("a kenarı: ");
        a = oku.nextInt();

        System.out.print("b kenarı: ");
        b = oku.nextInt();

        System.out.print("c kenarı: ");
        c = oku.nextInt();

        int u = (a+b+c)/2 ;
        double alan = Math.sqrt(u * (u - a)*(u - b)*(u - c)) ;
        System.out.println(alan);

    }



}
