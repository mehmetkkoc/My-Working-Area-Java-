package projeler.okulYonetimi.notHesaplama;


public class Student extends Course {
    private String nameSt;
    private String stNo;
    private String sinif;
    private String course1;
    private String course2;
    private String course3;
    private static double ortalama;




    public Student() {
    }


    public Student(String nameSt, String stNo, String sinif, String course1, String course2, String course3) {
        this.nameSt = nameSt;
        this.stNo = stNo;
        this.sinif = sinif;
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
    }

    public static void ogrenci() {

    }

    public static void topluSinavNotuEkle() {

    }

    public static void gectiMi(double ortalama) {
        if (ortalama>80){
            System.out.println("Gectiniz");
        }else{
            System.out.println("Kaldiniz");
        }

    }


    public static void ortalamaHesapla(double yazili, double sozlu) {
         ortalama = (yazili * 0.8) + (sozlu * 0.2);


        System.out.println(ortalama);
    }

    public static void notYazdir() {

    }


    public String getNameSt() {
        return nameSt;
    }

    public void setNameSt(String nameSt) {
        this.nameSt = nameSt;
    }

    public String getStNo() {
        return stNo;
    }

    public void setStNo(String stNo) {
        this.stNo = stNo;
    }

    public String getSinif() {
        return sinif;
    }

    public void setSinif(String sinif) {
        this.sinif = sinif;
    }

    public String getCourse1() {
        return course1;
    }

    public void setCourse1(String course1) {
        this.course1 = course1;
    }

    public String getCourse2() {
        return course2;
    }

    public void setCourse2(String course2) {
        this.course2 = course2;
    }

    public String getCourse3() {
        return course3;
    }

    public void setCourse3(String course3) {
        this.course3 = course3;
    }
    public double getOrtalama() {
        return ortalama;
    }

    public void setOrtalama(double ortalama) {
        this.ortalama = ortalama;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nameCl='" + nameCl + '\'' +
                ", yazili=" + yazili +
                ", sozlu=" + sozlu +
                ", nameTch='" + nameTch + '\'' +
                ", nameSt='" + nameSt + '\'' +
                ", stNo='" + stNo + '\'' +
                ", sinif='" + sinif + '\'' +
                ", course1='" + course1 + '\'' +
                ", course2='" + course2 + '\'' +
                ", course3='" + course3 + '\'' +
                '}';
    }
}
