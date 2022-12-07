public class Course {
    teacher teach;
    String name;
    String code;
    String prefix;
    String blm;
    int note;
    int sznote;

    Course(String name, String code, String prefix,String blm) {
        this.name = name;
        this.code = code;
        this.prefix=prefix;
        this.blm = blm;
        this.note=0;
        this.sznote =0;
    }
    void addTeacher(teacher teach){
        if(teach.branch.equals(this.prefix)){
            this.teach = teach;
        }
        else {
            System.out.println("Öğretmen Branşı Uygun DEğil");
        }

    }
    void printteacher(){
        this.teach.print();
    }
}
