public class teacher {
    String name;
    String blm;
    String branch;
    String tel;
    String age;

    teacher(String name, String blm, String branch, String tel,String age){
        this.name = name;
        this.blm = blm ;
        this.branch = branch;
        this.tel = tel;
        this.age=age;
       }
    void print() {
        System.out.println("Adı : "+ this.name );
        System.out.println("Bölüm : "+ this.blm );
        System.out.println("Branş : "+ this.branch );
        System.out.println("Telefon : "+ this.tel );
        System.out.println("Yaş : "+ this.age );

    }
}
