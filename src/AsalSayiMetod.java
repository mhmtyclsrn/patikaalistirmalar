import java.util.Scanner;

public class AsalSayiMetod {
    static boolean asal(int n) {
        int i ;
        for (i=2;i<n-1;i++){
            if (n%i==0){
                System.out.println(n+"Asal Sayıdeğildir");
                break;
            }
            else {
                System.out.println("Asal Sayıdır");
                break;
            }
        }


        return true;
    }
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        int n ;
        System.out.print("Sayı Giriniz : ");
        n= oku.nextInt();
        asal(n);

    }
}
