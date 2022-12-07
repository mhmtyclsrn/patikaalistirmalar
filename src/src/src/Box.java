public class Box {
    public static void main(String[] args) {
        Figther f1= new Figther("Battal Gazi :",10,90,90,50,50);
        Figther f2= new Figther("Polemon     :",10,90,90,50,50);

        match round1= new match(f1,f2,80,120);
        round1.run();
    }

}



