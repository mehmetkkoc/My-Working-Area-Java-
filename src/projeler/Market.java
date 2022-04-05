package projeler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Market {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<String> urun = new ArrayList<String>(Arrays.asList("Domates", "Patates", "Biber", "Sogan", "Havuc", "Elma", "Muz", "Cilek", "Kavun", "Uzum", "Limon"));

        List<Double> fiyat = new ArrayList<Double>(Arrays.asList(2.10, 3.20, 1.50, 2.30, 3.10, 1.20, 1.90, 6.10, 4.30, 2.70, 0.50));
        int secim = 0;
        double miktar = 0;
        double odenecek = 0;
        int tekrar = 0;
        double odeme = 0;
        int sayac = 0;
        double toplamOdenecek = 0;
        int count = 0;

        while (sayac < 1) {
            System.out.println("Lutfen Urun Giriniz");
            System.out.println("0 - Domates 1 - Patates 2 - Biber 3 - Sogan 4 - Havuc 5 - Elma 6 - Muz 7 - Cilek 8 - Kavun 9 - Uzum 10 - Limon");
            secim = scan.nextInt();
            System.out.println("Lutfen kg giriniz");
            miktar = scan.nextDouble();

            odenecek = fiyat.get(secim) * miktar;
            toplamOdenecek += odenecek;

            System.out.println(urun.get(secim) + "    " + miktar + " kg" + "    Tutar = " + odenecek + " TL");

            count=0;

            while (count < 1) {
                System.out.println("Tekrar Urun Secimi Yapmak Istiyor musunuz?\n1 - Evet    2 - Hayir");
                tekrar = scan.nextInt();
                if (tekrar == 1) {
                    count++;
                } else if (tekrar == 2) {
                    sayac++;
                    count++;
                    System.out.println("toplam odenecek tutar = " + toplamOdenecek + " TL dir");
                    System.out.println("Odeme yapacaginiz tutar kac TL?");
                    odeme = scan.nextDouble();

                    System.out.println("Yapilan Odeme : " + odeme + " TL\nUrun Bedeli : " + toplamOdenecek + " TL\nPara Ustu : " + (odeme - toplamOdenecek) + " TL");
                    System.out.println("Iyi Gunler Dileriz");
                    break;

                } else {
                    System.out.println("Hatali Giris \nTekrar Deneyin");

                }

            }


        }


    }
}
