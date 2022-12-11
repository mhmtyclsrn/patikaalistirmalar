import java.util.Scanner;

public class palindromKelime {

    static boolean isPalidrome(String str){
        int i=0;
        int j= str.length()-1;
        while (i < j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;

        }
        return true;
    }
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        String word ;
        System.out.println("Bir Kelime Yazın : ");
        word = oku.nextLine();

        System.out.println(isPalidrome(word));

    }
}
