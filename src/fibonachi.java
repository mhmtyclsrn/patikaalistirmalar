import java.util.Scanner;

public class fibonachi {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);

        int n,a=0,b=1,i ;
        int c;
        System.out.println("Sayı girin");
        n= oku.nextInt();
        for (i=0;i<=n;i++){
                c=a+b;
                System.out.println(a);
                a=b;
                b=c;

        }
    }
}
