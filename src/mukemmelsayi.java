import java.util.Scanner;

public class mukemmelsayi {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);

        int sayi ,kat=0 ;
        System.out.print("Sayı Giriniz : ");
        sayi=oku.nextInt();

        for (int i = 1 ; i<sayi;i++){
            if (sayi%i==0){
                kat+=i;
            }
        }
        if(kat==sayi){
            System.out.println("Mükemmel Sayıdır");
        }
        else System.out.println("Mükemmel Sayı Değildir");
    }
}
