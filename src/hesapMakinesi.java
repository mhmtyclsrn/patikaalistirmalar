import java.util.Scanner;

public class hesapMakinesi {
    public static void main(String[] args) {

        int n1 , n2 , islem ;

        Scanner oku = new Scanner(System.in);

        System.out.print("Birinci Sayı  :");
        n1 = oku.nextInt();
        System.out.print("İkinci Sayı   :");
        n2 = oku.nextInt();
        System.out.println("(1)Toplama\n(2)Çıkartma\n(3)Çapma\n(4)Bölme");
        System.out.print("İşlem Seçiniz :");
        islem = oku.nextByte();

        switch (islem) {
            case 1:
                System.out.println(n1+n2);
            case 2:
                System.out.println(n1-n2);
            case 3:
                System.out.println(n1*n2);
            case 4:
                if (n2 != 0) {
                    System.out.println(n1/n2);
                }
                else {
                    System.out.println("Bir Sayı Sıfıra Bölünemez3");
                }
            if (islem > 4) {
                System.out.println("Lüfen Geçerli Bir İşlem Giriniz");
            }



        }







    }
}
