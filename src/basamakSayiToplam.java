import java.util.Scanner;

public class basamakSayiToplam {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        int sayi ,basd ,bas ,bastoplam=0;
        System.out.print("Bir Sayı Girin : ");
        sayi= oku.nextInt();

        while (sayi!=0){
            basd=sayi%10;
            sayi/=10;
            bastoplam+=basd;

        }
        System.out.println("Basmak Değerleri Toplamı :"+bastoplam);
    }
}
