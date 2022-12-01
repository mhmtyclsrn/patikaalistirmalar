import java.util.Scanner;

public class harmoni {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);

        int sayi,a;
        double total=1;
        System.out.println("Bir Sayı Girin:");
        sayi= oku.nextInt();

        for( a=2;a<=sayi;a++){
            total+=(1.0/a);

        }
        System.out.println(total);

    }
}
