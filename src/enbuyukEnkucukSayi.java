import java.util.Scanner;

public class enbuyukEnkucukSayi {
    public static void main(String[] args) {
        Scanner oku= new Scanner(System.in);

        int i,s,gs,bs=1,ks=0;
        System.out.print("Kaç Sayı Gireceksiniz : ");
        s= oku.nextInt();
        for (i=1;i<=s;i++){
            System.out.print(i+".sayı :");
            gs= oku.nextInt();
            if (i==1){
                bs=gs;
                ks=gs;
            }
            if(gs>bs){
                bs=gs;
            }
            else if(gs<ks){
                ks=gs;
            }
        }
        System.out.println("En Büyüğü : " +bs);
        System.out.println("En Küçüğü : " +ks);
    }
}
