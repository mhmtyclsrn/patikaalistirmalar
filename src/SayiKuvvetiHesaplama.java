import java.util.Scanner;

public class SayiKuvvetiHesaplama {
    public static void main(String[] args) {
        int n ;
        Scanner oku = new Scanner(System.in);
        System.out.print("Bir Sayı Girin :");
        n= oku.nextInt();

        for ( int i=1;i<=n;i*=4) {
            System.out.println("4'ün kuvvetleri :"+i);
        }
        for (int j=1; j<=n;j*=5) {
            System.out.println("5'in Kuvvetleri :"+j);
        }



    }
}
