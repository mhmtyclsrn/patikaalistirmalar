public class Student {
    String name ;
    String cls ;
    String stno ;
    Course c1 ;
    Course c2;
    Course c3;
    double avarage;
    boolean isPass;
    Student(String name , String cls , String stno , Course c1 , Course c2 , Course c3){
        this.name=name;
        this.cls=cls;
        this.stno=stno;
        this.c1=c1;
        this.c2=c2;
        this.c3=c3;
        this.avarage=0.0;
        this.isPass=false;
    }
        void addNote(int note1,int sznote1, int note2 ,int sznote2, int note3,int sznote3){
        if(note1>=0 && note1<=100){
            this.c1.note=note1;
        }
            if(sznote1>=0 && sznote1<=100){
                this.c1.sznote=sznote1;
            }
        if(note2>=0 && note2<=100){
            this.c2.note=note2;
        }
            if(sznote2>=0 && sznote2<=100){
                this.c2.sznote=sznote2;
            }
        if(note3>=0 && note3<=100){
            this.c3.note=note3;
        }
            if(sznote3>=0&&sznote3<=100){
                this.c3.sznote=sznote3;
            }

        }

        void isPass(){
        this.avarage = ((this.c1.note*0.8)+(this.c1.sznote*0.2)  +
                (this.c2.note*0.8) +(this.c2.sznote*0.2)+ (this.c3.note*0.8)+(this.c3.sznote*0.2)) / 3.0 ;
        if (avarage>55){
            System.out.println("Sınıfı Geçtiniz");
            this.isPass = true;
        }else{
            System.out.println("Geçemediniz");
            this.isPass = false;
         }
        printNote();
        }
        void printNote(){
            System.out.println(this.c1.name + " Notu  : " +this.c1.note);
            System.out.println(this.c1.name + "Sözlü Notu : " +this.c1.sznote);
            System.out.println(this.c2.name + " Notu      : " +this.c2.note);
            System.out.println(this.c2.name + "Sözlü Notu : " +this.c2.sznote);
            System.out.println(this.c3.name + " Notu      : " +this.c3.note);
            System.out.println(this.c3.name + "Sözlü Notu : " +this.c3.sznote);
            System.out.println("Ortalamanız     : " + this.avarage+"\n");
        }


}
