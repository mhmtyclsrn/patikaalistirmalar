import java.util.Scanner;

public class ebobEKOK {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);

        int sayi1, sayi2 ;

        System.out.print("Sayı 1 : ");
        sayi1= oku.nextInt();
        System.out.print("Sayı 2 : ");
        sayi2= oku.nextInt();

        int ebob=1 ,ekok=1;
        for (int i=1 ; i<=sayi1 && i<=sayi2;i++){
            if (sayi1%i==0 && sayi2%i==0){
                ebob=i;
            }

        }
        System.out.println("EBOB = "+ebob);
        System.out.println("EKOK = "+(sayi1*sayi2)/ebob);
    }
}
