import java.util.Scanner;

public class kombinasyon {
    public static void main(String[] args) {
        int i ,r, itoplam=1 , rtoplam=1,ktoplam=1 ;
        Scanner oku = new Scanner(System.in);
        System.out.print("N Değeri :");
        i= oku.nextInt();
        System.out.print("r DEğeri :");
        r= oku.nextInt();

        for (int n=1 ; n<=i;n++){
            itoplam*=n;
        }
        for(int m=1;m<=r;m++){
            rtoplam*=m;
        }
        for (int k=1;k<=i-r;k++){
            ktoplam*=k;
        }
        System.out.println("kombinasyonu : "+itoplam/(rtoplam*ktoplam));
    }
}
