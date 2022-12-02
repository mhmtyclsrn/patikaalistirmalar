import java.util.Scanner;

public class atm {
    public static void main(String[] args) {

        String user,pas;
        Scanner oku = new Scanner(System.in);
        int hak=3;
        int islem;
        int bakiye=2497;

        while (hak>0){
            System.out.print("Kullanıcı Adı : ");
            user= oku.nextLine();
            System.out.print("Parola : ");
            pas= oku.nextLine();
            if(user.equals("yucel")&&pas.equals("123")){

                System.out.println("Giriş Başarılı");
                System.out.println("Yapmak istediğiniz İşlemi seçiniz \n" +
                        "1) Para Çekme\n" +
                        "2) Para yatırma\n" +
                        "3) Para bakiye srgula\n" +
                        "4) Çıkış");
                islem= oku.nextInt();
                switch (islem){
                    case 1:
                        System.out.print("Cekmek İstediğiniz Tutar : ");
                        islem= oku.nextInt();
                        if(islem>bakiye){
                            System.out.println("Yetersiz Bakiye");}
                        else {
                            System.out.println("Kalan Bakiye: "+(bakiye-=islem));
                        }
                        break;
                    case 2:
                        System.out.print("Yatırmak istediğiniz tutar : ");
                        islem= oku.nextInt();
                        System.out.println("Yeni Bakiye : " +(bakiye+=islem));
                        break;
                    case 3:
                        System.out.println("Bakiyeniz = " +bakiye);
                        break;
                    case 4:
                        System.out.println("Tekrar Görüşmek üzere");
                        hak=0;
                }

            }
            else {
                System.out.println("Hatalı Giriş Yaptınız");
                System.out.println("Kalan Hakkınız : "+ --hak);
            }
        }
    }
}
