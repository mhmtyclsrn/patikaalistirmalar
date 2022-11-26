import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {

        int mat , fiz , turk , tar, bio ,toplam=0 , sayac=0 ;
        Scanner oku = new Scanner(System.in);
        System.out.print("Matematik Notunuz :");
        mat= oku.nextInt();
        System.out.print("Fizik Notunuz     :");
        fiz= oku.nextInt();
        System.out.print("Türkçe Notunuz    :");
        turk= oku.nextInt();
        System.out.print("Tarih Notunuz     :");
        tar= oku.nextInt();
        System.out.print("Biyoloji Notunuz  :");
        bio= oku.nextInt();

        if (mat<=100 && mat>=0) {
            toplam+=mat;  sayac++ ;

        }
        if (fiz<=100 && fiz>=0) {
            toplam+=fiz;  sayac++ ;

        }
        if (turk<=100 && turk>=0) {
            toplam+=turk;  sayac++ ;

        }
        if (tar<=100 && tar>=0) {
            toplam+=tar;  sayac++ ;

        }
        if (bio<=100 && bio>=0) {
            toplam+=bio;  sayac++ ;

        }

        if (toplam/sayac>=55) {

            System.out.print("Ortalamanız :");
            System.out.println(toplam/sayac + " Geçtiniz");

        }
        else {
            System.out.print("Ortalamanız :");
            System.out.println(toplam/sayac +" Kaldınız !");
        }





    }
}
