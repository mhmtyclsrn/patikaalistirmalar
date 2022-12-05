import java.util.Scanner;

public class rakamSekiller {

    static void downup(int n){
        int temp=n ,i;
        System.out.println(temp);
        for (i=1;0<temp;i++){
                temp-=5;
            System.out.println(temp);
            }
        for(i=1;temp<n;i++){
            temp+=5;
            System.out.println(temp);
        }
    }

    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.print("Bir Sayı Girin : ");
        int n= oku.nextInt();

        downup(n);

    }
}
