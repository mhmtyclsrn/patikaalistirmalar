import java.util.Scanner;
public class polindrom {
    static boolean isPalindrom(int n){
        int lastnum , temp=n , xn=0;

        while( temp!=0){
            lastnum=temp%10;
            xn=xn*10+lastnum;
            temp=temp/10;
        }
        if ( n==xn){
            return true;
        }
        else
            return false;

    }

    public static void main(String[] args) {
        Scanner oku= new Scanner(System.in);
        System.out.print("Sayı Girin : ");
        int n ;
        System.out.println();
        n= oku.nextInt();

        System.out.println(isPalindrom(n));

    }
}
