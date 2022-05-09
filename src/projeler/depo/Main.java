package projeler.depo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void calisma() {

        Scanner scan = new Scanner(System.in);

        List<UrunBilgileri> yeni = new ArrayList<>();
        Islemler isl1=new Islemler();
        int islem=0;

        boolean devamMi = true;

        System.out.println("\nDepo Uygulamasina Hosgeldiniz");

        while (devamMi){
            System.out.println("\nLutfen Yapmak Istediginiz Islemi Seciniz" +
                    "\n1 - Urun Tanimlama\n2 - Urun Listele\n3 - Urun Girisi" +
                    "\n4 - Urunu Rafa Koy\n5 - Urun Cikisi\n6 - Calismayi Sonlandir");

            islem= scan.nextInt();

            switch(islem){
                case 1:
                    yeni=isl1.urunTanimlama();
                    break;
                case 2:
                    isl1.urunListele(yeni);
                    break;
                case 3:
                    isl1.urunGirisi(yeni);
                    break;
                case 4:
                    isl1.urunRafaKoy(yeni);
                    break;
                case 5:
                    isl1.urunCikisi(yeni);
                    break;
                case 6:
                    devamMi=false;
                    System.out.println("Calisma sonlandirildi");
                    break;
                default:
                    System.out.println("hatali veri girisi");
                    break;
            }


    }



    }

}
