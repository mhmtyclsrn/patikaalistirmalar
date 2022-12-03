public class h {
    public static void main(String[] args) {

        int i  ;
        System.out.print("2,3,5,7");
        for (i=2;i<100;i++){
            if (i%2!=0){
                if (i%3!=0){
                    if (i%5!=0){
                        if (i%7!=0){
                            System.out.print(","+i);
                        }
                    }
                }
            }

        }
    }
}
