import java.util.Random;
import java.util.Scanner;

public class MineSweeper {

    int satNum;
    int sutNum;
    int mayinNum;
    int start;
    int hamle ;
        String[][] gorunurALan;
        String[][] gizliAlan;

        MineSweeper(int satNum, int sutNum){
            this.satNum = satNum;
            this.sutNum = sutNum;
            this.mayinNum = (satNum*sutNum)/4;
            this.gorunurALan = new String[satNum][sutNum];
            this.gizliAlan = new String[satNum][sutNum];
            this.hamle = (satNum*sutNum)-mayinNum;
            this.start = start;
            setFields();

        }
      public void setFields(){
            Random rnd=new Random();
            int randSat;
            int randSut;

            for (int i =0; i<mayinNum;i++){
                randSat=rnd.nextInt(satNum);
                randSut= rnd.nextInt(sutNum);
                if (this.gizliAlan[randSat][randSut] !="*"){
                    this.gizliAlan[randSat][randSut] ="*";

                }
                else {
                    i--;
                }
            }
            for (int i=0;i<gizliAlan.length;i++){
                for(int j=0;j< gizliAlan.length;j++){
                    if(gizliAlan[i][j]!="*"){
                        gizliAlan[i][j]="_";
                    }
                    else {
                       // j--;
                    }
                }
            }
        }
        void gorunurAlan(){
        for (int i=0; i< satNum;i++){
            for(int j=0;j<sutNum;j++){
                if(start==0){
                    gorunurALan[i][j]="_";
                    System.out.print(gorunurALan[i][j]+" ");

                }
                else {
                    System.out.print(gorunurALan[i][j]+" ");
                }




            }
            System.out.println();

        }
            start++;

    }
    void gizliAlan(){

        for (int i=0; i< satNum;i++){
            for(int j=0;j<sutNum;j++){
                System.out.print(gizliAlan[i][j]+" ");
            }
            System.out.println();
        }
            System.out.println("<========Gizli Alan===========>");
    }
    void run(){
        Scanner oku=new Scanner(System.in);
            int sat ,sut ,may=0;
            gizliAlan();
            gorunurAlan();
        System.out.println("<========"+satNum+" X "+sutNum+" ölçekli harita ========>");


            while(0<hamle){
                System.out.print("Satır NO:  ");
                sat=oku.nextInt();
                System.out.print("Sutun NO:  ");
                sut=oku.nextInt();
                if(sat>satNum-1||sut>sutNum-1){
                    System.out.println(" Geçerli Bir Değer Girin");
                    continue;
                }
                if(!this.gorunurALan[sat][sut].equals("_")){
                    System.out.println("Oynanmış Hamle");
                    hamle++;

                }
                if(gizliAlan[sat][sut]=="*"){
                    System.out.println("mayına bastınız");
                    break;
                }
                    if(gizliAlan[sat][sut]!="*"){

                        if(sat!=0&&sut!=0)
                        if(gizliAlan[sat-1][sut-1]=="*")
                        {
                            may++;
                        }
                        if(sat!=0){
                        if(gizliAlan[sat-1][sut]=="*")
                        { may++;}
                        }

                        if(sat!=0&&sut<sutNum-1){
                        if(gizliAlan[sat-1][sut+1]=="*")
                        {may++;}
                        }

                        if(sut!=0){
                        if(gizliAlan[sat][sut-1]=="*")
                        {may++;}
                        }

                        if(sut<sutNum-1){
                        if(gizliAlan[sat][sut+1]=="*")
                        { may++;}
                        }

                        if(sut!=0&&sat<satNum-1){
                        if(gizliAlan[sat+1][sut-1]=="*")
                        {may++;}
                        }

                        if(sat<satNum-1){
                        if(gizliAlan[sat+1][sut]=="*")
                        {may++;}
                        }

                        if(sat<satNum-1&&sut<sutNum-1)
                        if(gizliAlan[sat+1][sut+1]=="*")
                        {
                            may++;
                        }
                        gorunurALan[sat][sut]=String.valueOf(may);
                        may=0;
                        gorunurAlan();
                        if(hamle==1){
                            System.out.println("Tebrikler KAzandınız !");
                            break;
                        }
                        System.out.println((hamle-=1)+" hamleniz kaldı !");




                    }



            }




    }
}
