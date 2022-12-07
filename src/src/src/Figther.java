public class Figther {
    String name;
    int dammage ;
    int healt ;
    int weigth ;
    int chance;
    int block;


    Figther(String name , int dammage , int healt , int weigth , int chance,int block ){

        this.name = name;
        this.dammage=dammage;
        this.healt= healt;
        this.weigth=weigth;
        this.chance=chance;
        if(block>0&&100>block){
            this.block=block;
        }
        else this.block=0;



    }
        int hit(Figther enemy){
            System.out.println(this.name + " vurdu >====@ "+ this.dammage+" hasar verdi");
            if (enemy.isBlok()){
                System.out.println(enemy.name + " Blokladı ve hasardan kurtuldu !...");
                return enemy.healt;
            }

            if (enemy.healt-this.dammage<0){
                return 0;
            }
            return enemy.healt - this.dammage;



        }
        boolean isBlok(){
        double randomNumber= Math.random()*100;
        return randomNumber<= this.block;
    }
}
