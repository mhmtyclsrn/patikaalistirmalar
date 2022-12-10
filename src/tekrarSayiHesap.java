import java.util.Arrays;

public class tekrarSayiHesap {
    static boolean isFind(int[] arr, int value){
        for (int i:arr){
            if(i==value){
                return true;
            }

        }

    return false;
    }

    public static void main(String[] args) {
        int [] list = {41,41,61,61,13,41,61,21,21};
        int n=0;
        int i=0;
        int [] tekrar= new int [list.length];
        int startIndex = 0;

        for ( i=0;i<list.length;i++){
            for (int j=0; j <list.length;j++){
                if(list[i]==list[j]){
                    n++;
                }
            }
            if(!isFind(tekrar,list[i])){
                tekrar[startIndex++] = list[i];
                System.out.println(list[i] +"  "+ n +" kere tekrar etmiş");

            }
            n=0;
        }

    }

}
