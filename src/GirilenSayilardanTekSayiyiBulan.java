import java.util.Scanner;

public class GirilenSayilardanTekSayiyiBulan {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);

        int a=1,toplam=0;

        while (a>0){
            System.out.print("Bir Sayı Girin :");
            a= oku.nextInt();
            if(a%2 !=0){
                System.out.println(toplam+=a);
            }

        }
    }
}
