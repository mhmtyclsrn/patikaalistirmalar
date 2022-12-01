import java.util.Scanner;
public class amstrong {
    public static void main(String[] args) {
        Scanner oku= new Scanner(System.in);

        int a=0, c=0 ,t=1,total=0;
        int b ;
        System.out.print("Bir Sayı Girin :");
        b= oku.nextInt();
        int d=b;
        int k=b;
        while(b!=0){
            b/=10;
            a++;
        }
        while(d!=0){
            t=1;
             c=d%10;
              d/=10;
            for(int e=0;e!=a;e++){
                t*=c;
            }
                total+=t;
        }
        System.out.print(total);
        if(k==total){
            System.out.print(" bir Amstrog sayıdır");
        }
        else System.out.println(" bir Amstrog sayı değildir !");

    }
}
