import java.util.Scanner;

public class ucakBileti {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);

        int mes,yas ,yon ;
        double km=0.10, toplam=0 ;

        System.out.print("Yaşınız   :");
        yas = oku.nextInt();
        System.out.print("Mesafe    :");
        mes = oku.nextInt();
        System.out.print(" Yön seçiniz Tek yön (1) Gidiş Dönüş (2) :");
        yon = oku.nextInt();

        if(yas<=0) {
            System.out.println("hatalı veri");
        }
        if (yas<12&&yas>0) {
            toplam= km*mes*0.5;
        }
        if (yas<24&&yas>12) {
            toplam= km*mes*0.9;
        }
        if (yas>65) {
            toplam= km*mes*0.7;
        }
        if (yon==2) {
            System.out.println(toplam*2*0.8);
        }
        if (yon==1) {
            System.out.println(toplam);
        }

        else System.out.println("Hatalı veri Girdiniz");





    }
}
