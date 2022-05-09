package projeler.okulYonetimi.veriYonetimi;


import java.util.Locale;
import java.util.Scanner;

public class Islemler {

    static Scanner scan=new Scanner(System.in);

    public static void anaMenu() {

        Ogrenci ogrenci=new Ogrenci();
        Ogretmen ogretmen=new Ogretmen();

        System.out.println("==================================");
        System.out.println("ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ\n==================================\n1 - OGRENCI ISLEMLERI\n2 - OGRETMEN ISLEMLERI\nQ - CIKIS");

        char menuTercih = scan.next().toUpperCase().charAt(0);

        switch (menuTercih) {
            case '1':
                ogrenci.islemler();
                break;
            case '2':
                ogretmen.islemler();
                break;
            case 'Q':
                cikis();
                break;
            default:
                System.out.println("Hatali Secim\n\nTekrar Deneyin");
                anaMenu();
                break;
        }
    }

public static void cikis() {
    System.out.println("IYI GUNLER DILERIZ");
}





}
