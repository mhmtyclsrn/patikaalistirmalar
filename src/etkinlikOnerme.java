import java.util.Scanner;

public class etkinlikOnerme {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);

        int sicaklik ;

        System.out.print("Hava Sıcaklığını Girin : ");
        sicaklik = oku.nextInt();

        if (sicaklik<5) {
            System.out.println(" Kayak Yapabilirsiniz");

        } else if (sicaklik>5 && sicaklik<15) {
            System.out.println("Sinemaya Gidebilirsin") ;
            if (sicaklik>10 && sicaklik<25 ) {
                System.out.println("Piknik Yapabilirsin");}

        } else  {
            System.out.println("PiknikYapmaya Gidebilirsin");

        }
    }
}
