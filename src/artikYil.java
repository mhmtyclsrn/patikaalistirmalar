import java.util.Scanner;

public class artikYil {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);

        int yil ;
        System.out.print("Yıl Giriniz  :");
        yil= oku.nextInt();

        if (yil%100!=0&&yil%4==0) {
            System.out.println(yil +" Artık Yıldır");
        }
        if (yil%100==0&&yil%400==0) {
            System.out.println("Artık Yıldır");
        }
        else System.out.println("Artık Yıl DEğildir");


    }
}
