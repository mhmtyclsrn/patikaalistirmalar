import java.util.Scanner;

public class user {
    public static void main(String[] args) {
        String user , pass , cvp , ynl ;
        Scanner oku = new Scanner(System.in);
        System.out.print("Kullanıcı adı:");
        user = oku.nextLine();
        System.out.print("Şifreniz     :");
        pass = oku.nextLine();
        if (user.equals("ŞirinAVM") && pass.equals("yusuf2013")) {
            System.out.println("Giriş Başarılı");}

        else  if (!pass.equals("yusuf2013")) {
            System.out.println("Şifre hatalı , yenilemek istermisiniz? (e/h)");
            cvp = oku.nextLine();
            if (cvp.equals("e")){
                System.out.print("Yeni Şifre  : ");
            ynl = oku.nextLine();
                if (ynl.equals("yusuf2013")) {
                    System.out.println("Eski Bir Şifre Girdiniz , başka deneyiniz");


                }
                else System.out.println("Yeni Şifre başarıyla Oluşturuldu");
            }


        }


    }
}
