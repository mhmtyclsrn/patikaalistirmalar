import java.util.Scanner;

public class sayiSiralama {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in) ;

        int a , b, c ;
        System.out.print("Birinci Sayı  :");
        a = oku.nextInt();
        System.out.print("İkinci Sayı   :");
        b = oku.nextInt();
        System.out.print("Üçüncü Sayı   :");
        c = oku.nextInt();

        if (a<b && a<c) {
            System.out.print(a +" < ");
            if (b<c) {
                System.out.println(b +" < "+c);
            }
            else System.out.println(c + " < " +b);

        } else if (b<c && b<a) {
            System.out.print(b +" < ");
            if (a<c) {
                System.out.println(a +" < "+c);
            }
            else System.out.println(c + " < " +a);

        } else if (c<a && c<b) {
            System.out.print(c +" < ");
            if (b<a) {
                System.out.println(b +" < "+a);
            }
            else System.out.println(a + " < " +b);
            
        }
    }
}
