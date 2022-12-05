import java.util.Scanner;

public class RecursiveUsAlma {
    static void usalma() {
        Scanner oku=new Scanner(System.in);
        int tab, us ,i=1,result=1;
        System.out.print("Taban Sayısı : ");
        tab= oku.nextInt();
        System.out.print("Üs sayısı : ");
        us= oku.nextInt();

        for(i=1;i<=us;i++){
            result*=tab;
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
       usalma();

    }
}
