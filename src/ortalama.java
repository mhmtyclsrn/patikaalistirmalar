import java.util.Scanner;

public class ortalama {
    public static void main(String[] args) {

        int mat, fiz , kim , bio , muz , turk ;

        Scanner oku = new Scanner(System.in) ;
        System.out.print("Matematik Notu :");
        mat = oku.nextInt();

        System.out.print("Fizik Notu :");
        fiz = oku.nextInt();

        System.out.print("Kimya Notu :");
        kim = oku.nextInt();

        System.out.print("Biyoloji Notu :");
        bio = oku.nextInt();

        System.out.print("Müzik Notu :");
        muz = oku.nextInt();

        System.out.print("Türkçe Notu :");
        turk = oku.nextInt();

        double toplam = ((mat+fiz+bio+kim+muz+turk)/6);

        System.out.println(toplam);

        String sonuc = (toplam >= 60) ? "Geçti":"Kaldı";

        System.out.println(sonuc);





    }
}
