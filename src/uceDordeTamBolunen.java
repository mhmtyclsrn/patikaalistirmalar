import java.util.Scanner;

public class uceDordeTamBolunen {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);

        int k , sayac=0 , toplam=0 ;
        System.out.print("Bir Sayı Giriniz :");
        k = oku.nextInt();

        for ( int i=0;i<k;i++){
            if(i%4==0&&i%3==0){
                sayac++;
                toplam+=i;
            }
        }
        System.out.println(toplam/sayac);
    }
}
