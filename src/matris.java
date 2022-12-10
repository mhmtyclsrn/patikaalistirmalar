public class matris {
    public static void main(String[] args) {


        int [][] matris1 = {
                {1,2,3},
                {4,5,6}    };
        int i;
        int j;
        for ( i =0; i< matris1.length; i++){
            for ( j=0;j< matris1[i].length ; j++){
                System.out.print(matris1[i][j]+"  ");
            }
            System.out.println();
        }
        System.out.println("\n");
        for ( i =0; i< matris1.length+1; i++){
            for ( j=0;j< matris1.length ; j++){
                System.out.print(matris1[j][i]+"  ");
            }
            System.out.println();
            }




    }
}
