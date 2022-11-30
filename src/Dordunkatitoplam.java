import java.util.Scanner;

public class Dordunkatitoplam {
    public static void main(String[] args) {
        int n ;
        int toplam=0;
        Scanner oku = new Scanner(System.in);

        do {
            System.out.println("Bir Sayı Girin : ");
            n=oku.nextInt();
            if(n%2==0&&n%4==0) {
                toplam+=n ;

            }

        } while (n%2==0);
        System.out.println("Topla : "+toplam);



    }
}
