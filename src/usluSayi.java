import java.util.Scanner;
public class usluSayi {
    public static void main(String[] args) {
        Scanner oku= new Scanner(System.in);
        int n,u,i=1;

        System.out.print("Sayı Girin :");
        n= oku.nextInt();
        System.out.print("Üs Girin :");
        u= oku.nextInt();

        for (int a=1;a<=u;a++){
                     i*=n;
        }
        System.out.println("Sonuç :"+i);
    }
}
