package projeler.okulYonetimi;

import java.util.Scanner;

public class Course {

    String nameCl;
    double yazili;
    double sozlu;
    String nameTch;

    public Course() {
    }

    public Course(String nameCl, double yazili, double sozlu, String nameTch) {
        this.nameCl = nameCl;
        this.yazili = yazili;
        this.sozlu = sozlu;
        this.nameTch = nameTch;
    }

    public static void course(String nameCl,double yazili,double sozlu,String nameTch){
        Scanner scan = new Scanner(System.in);
        System.out.println("ders adi girin");
        nameCl=scan.next();
        System.out.println("yazili notu ?");
        yazili=scan.nextDouble();
        System.out.println("sozlu ?");
        sozlu=scan.nextDouble();
        System.out.println("ogretmen adi");
        nameTch=scan.next();

    }
    public static void addTeacher(){

    }
    public static void printTeacher(){

    }

}
