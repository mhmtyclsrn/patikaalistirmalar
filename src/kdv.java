import java.util.Scanner;

public class kdv {
    public static void main(String[] args) {
        double tutar ;

        Scanner oku = new Scanner(System.in);
        System.out.print("Alışveriş Tutarı :");
        tutar = oku.nextDouble();

        boolean buyuk = tutar >= 1000;
        String oran =  buyuk ? "%8 KDV : " : "%18 KDV : ";
        System.out.print(oran);

        double matrah = buyuk ? (tutar*8/100) : (tutar*18/100) ;
        System.out.println(matrah);

        double toplam = (matrah+tutar) ;
        System.out.print("KDVli Tutar : ");
        System.out.println(toplam);




    }
}
