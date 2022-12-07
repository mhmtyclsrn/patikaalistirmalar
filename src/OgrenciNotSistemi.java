public class OgrenciNotSistemi {
    public static void main(String[] args) {
        teacher t1 = new teacher("Şenol Güneş","Sayısal","Fizik","11111","56");
        teacher t2 = new teacher("İlber Ortaylı","Sözel","Tarih","22222","82");
        teacher t3 = new teacher("Semih Saygıner","Sayısal","Matematik","33333","43");

        Course mat = new Course("Matematik","619","Matematik","Sayısal");
        mat.addTeacher(t3);
        Course fiz = new Course("Fizik","718","Fizik","Sayısal");
        fiz.addTeacher(t1);
        Course tarih = new Course("Tarih","561","Tarih","Sözel");
        tarih.addTeacher(t2);

        Student s1 = new Student("Cinali","4","2497" ,mat,fiz,tarih);
        s1.addNote(100,80,70,20,90,80);
        s1.isPass();

        Student s2 = new Student("Şerafettin","3","1287",mat,fiz,tarih);
        s1.addNote(40,30,70,80,90,80);
        s2.isPass();
    }

}
