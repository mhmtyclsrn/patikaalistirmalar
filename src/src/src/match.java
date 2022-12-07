public class match {
    Figther f1;
    Figther f2;
    int minWeigth;
    int maxWeigth;
    int start=0;

    public match(Figther f1,Figther f2,int minWeigth,int maxWeigth){
            this.f1=f1;
            this.f2=f2;
            this.minWeigth=minWeigth;
            this.maxWeigth=maxWeigth;
    }



    void run(){
        if(isCheck()){
            while (this.f1.healt>0 && this.f2.healt>0){
                System.out.println("\n========YENİ RAUND========\n");

                double randomNumber= Math.random()*100;
                if(randomNumber<50&&start==0){
                    this.f1.healt=f2.hit(f1);

                }
                start+=1;

                this.f2.healt=f1.hit(f2);
                if (isWin()){
                    break;
                }

                this.f1.healt=f2.hit(f1);
                if (isWin()){
                    break;
                }

                System.out.println(f2.name+f2.healt);
                System.out.println(f1.name+f1.healt);



            }

        }
        else{
            System.out.println("Dövüşçü Sikletleri uymuyor");
        }
    }

    boolean isCheck(){
        return (this.f1.weigth>=minWeigth && this.f1.weigth<=maxWeigth)&&
                (this.f2.weigth >=minWeigth&&this.f2.weigth <=maxWeigth);

    }

    boolean isWin(){
        if (this.f2.healt==0){
            System.out.println(f1.name + "Kazandı !");
            return true;
        }

        if (this.f1.healt==0){
            System.out.println(f2.name + "Kazandı !");
            return true;

        }
          return false;
    }


}
