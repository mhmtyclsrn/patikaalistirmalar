import java.util.Arrays;
import java.util.Scanner;

public class dizilerSiralama {
    public static void main(String[] args) {

        Scanner oku= new Scanner(System.in);


        int i;
        int gs;
        int startIndex=0;
        System.out.print("Dizi Boyutu : ");
        int a= oku.nextInt();
        int [] list = new int[a];

        for(i=0;i<a;i++){
            System.out.print("Sayı Giriniz : ");
            gs=oku.nextInt();
            list[startIndex++]=gs;
        }
        Arrays.sort(list);
        for (i=0;i<a;i++){
            System.out.println((i+1)+". eleman : "+ list[i]);
        }
    }




}
