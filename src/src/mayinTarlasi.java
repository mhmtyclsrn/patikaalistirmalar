import java.util.Scanner;

public class mayinTarlasi {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        int sut , sat ;


        System.out.println("Harita Büyüklüğünü Satır ve Sutun Adedi ile Belirleyebilirsin");

        System.out.print("satır Adedi : ");
        sat=oku.nextInt();
        System.out.print("Sutun Adedi : ");
        sut=oku.nextInt();

        MineSweeper ebat = new MineSweeper(sat,sut);

        ebat.run();
        }


}
