public class Workers {
    String name;
    int workHours;
    int hireYear;
    double bonus;
    double salary;
    double tax;
    double zam;
    double total;

    public Workers (String name,int salary , int workHourse,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHourse;
        this.hireYear=hireYear;
        this.tax=tax;
        this.zam=zam;
        this.total=total;

    }
        double tax(){

        if(this.salary>1000)
            return this.salary*0.03;
        return 0;
        }

        double bonus(){
        if(this.workHours>40)
            return this.bonus+((this.workHours-40)*30)*4;
        return 0;
        }

        double zam(){
        if (2021-hireYear<10){
            return this.salary*0.05;
        }
        if (2021-hireYear>9&&2021-hireYear<20){
            return this.salary*0.10;
        }
        if (2021-hireYear>19)
            return this.salary*0.15;
            return 0;
    }

    void printInfo(){
        System.out.println("İsim                   : " + this.name);
        System.out.println("Maaş                   : " + this.salary);
        System.out.println("Haftalık Çalışma Saaati: " + this.workHours);
        System.out.println("İşe Giriş Tarihi       : " + this.hireYear);
        System.out.println("Vergi                  : " + this.tax());
        System.out.println("Bonus                  : " + this.bonus());
        System.out.println("Maaş Zammı             : " + this.zam());
        System.out.println("Vergi ve Bonuslar \n" +
                           "ile birlikte maaş      : " + (this.salary-this.tax()+this.bonus()));
        System.out.println("Total Salary           : " + (this.salary-this.tax()+this.bonus()+this.zam()));
    }

}
