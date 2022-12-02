import java.util.Scanner;

public class tersUcgen {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);

        int bs;
        System.out.println("Basamak Sayısı Girin : ");
        bs= oku.nextInt();

        for (int i=1; i<bs;i++){

            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<(bs*2)-(2*i);k++){
                System.out.print("*");
            }
            System.out.println();


        }
    }
}
