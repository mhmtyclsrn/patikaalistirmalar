import java.util.Scanner;

public class GelismisHesapMak {
    static void top() {
        Scanner scan = new Scanner(System.in);
        int n, s = 0, i = 1;
        while (true) {
            System.out.print(i++ + ". sayı :");
            n = scan.nextInt();
            if (n == 0) {
                break;
            }
            s += n;
        }
        System.out.println("Sonuç : " + s);
    }
    static void cik() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı adedi :");
        int c = scan.nextInt();
        int n, result = 0;
        for (int i = 1; i <=c; i++) {
            System.out.print(i + ". sayı :");
            n = scan.nextInt();
            if (i == 1) {
                result += n;
                continue;
            }
            result -= n;
        }

        System.out.println("Sonuç : " + result);
    }

    static void carp() {
        Scanner scan = new Scanner(System.in);
        int n, s = 1, i = 1;

        while (true) {
            System.out.print(i++ + ". sayı :");
            n = scan.nextInt();
            if (n == 1)
                break;
            if (n == 0) {
                s = 0;
                break;
            }
            s *= n;
        }
        System.out.println("Sonuç : " + s);
    }
    static void bol() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int c = scan.nextInt();
        double n, s = 0.0;
        for (int i = 1; i <= c; i++) {
            System.out.print(i + ". sayı :");
            n = scan.nextDouble();
            if (i != 1 && n == 0) {
                System.out.println("Böleni 0 giremezsiniz.");
                continue;
            }
            if (i == 1) {
                s = n;
                continue;
            }
            s /= n;
        }
        System.out.println("Sonuç : " + s);
    }
    static void us() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değeri giriniz :");
        int taban = scan.nextInt();
        System.out.print("Üs değeri giriniz :");
        int u = scan.nextInt();
        int s = 1;
        for (int i = 1; i <= u; i++) {
            s *= taban;
        }
        System.out.println("Sonuç : " + s);
    }
    static void fac() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        int n = scan.nextInt();
        int s = 1;

        for (int i = 1; i <= n; i++) {
            s *= i;
        }

        System.out.println("Sonuç : " + s);
    }

    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        int select ;
        String menu = "1- Toplama\n"
                + "2- Çıkarma\n"
                + "3- Çarpma\n"
                + "4- Bölme\n"
                + "5- Üslü Sayı Hesapla\n"
                + "6- Faktoriyel Hesapla\n"
                + "7- Mod Al\n"
                + "8- Dikdörtgen Alan ve Çevre Hesapla\n"
                + "0- Çıkış Yap";

        do {
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz :");
            select = oku.nextInt();
            switch (select) {
                case 1:
                    top();
                    break;
                case 2:
                    cik();
                    break;
                case 3:
                    carp();
                    break;
                case 4:
                    bol();
                    break;
                case 5:
                    us();
                    break;
                case 6:
                    fac();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlış değer , Farklı Değer Giriniz.");
            }
        } while (select != 0);


    }
}