import java.util.Arrays;
import java.util.Scanner;

public class EnYakinBK {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);

        System.out.println("Bir Sayı Girin : ");
        int[] list = {36, 314, 1, 18, 134, 4, 63};

        int min = list[0];
        int max = list[0];
        int number;
        number= oku.nextInt();
        Arrays.sort(list);
        for (int i : list) {
            if(i<number){
                min=i;
            }
            if(i>number){
                max=i;
                break;
            }
        }
        System.out.println("Min sayı : "+min);
        System.out.println("max sayı : "+max);
    }
}
