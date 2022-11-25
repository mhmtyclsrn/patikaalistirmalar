import java.util.Scanner;

public class manav {
    public static void main(String[] args) {

        System.out.println("Şirin AVM Bilgi Fişi");

        double elma= 3.67 , armut=2.14 , domates=1.11 , muz=0.95, patlican=5;
        double ekg , akg , dkg , mkg , pkg ;
        Scanner oku= new Scanner(System.in);
        System.out.print("Elma KG      : ");
        ekg = oku.nextDouble();
        System.out.print("Armut KG     : ");
        akg = oku.nextDouble();
        System.out.print("Domates KG   : ");
        dkg = oku.nextDouble();
        System.out.print("Muz KG       : ");
        mkg = oku.nextDouble();
        System.out.print("Patlıcan KG  : ");
        pkg = oku.nextDouble();

        System.out.println("Elma         :"+ elma + "TL X " + ekg + " KG = " + (elma*ekg)+"TL");
        System.out.println("Armut        :"+ armut + "TL X " + akg + " KG = " + (armut*akg)+"TL");
        System.out.println("Domates      :"+ domates + "TL X " + dkg + " KG = " + (domates*dkg)+"TL");
        System.out.println("Muz          :"+ muz + "TL X " + mkg + " KG = " + (muz*mkg)+"TL");
        System.out.println("Patlıcan     :"+ patlican + " TL X " + pkg + " KG = " + (patlican*pkg)+"TL");

        double toplam = (elma*ekg)+(armut*akg)+(domates*dkg)+(muz*mkg)+(patlican*pkg) ;
        System.out.println("TOPLAM TUTAR : " + toplam +"  TL");

        System.out.println("Yine Bekleriz ! Şirin AVM");



    }
}
