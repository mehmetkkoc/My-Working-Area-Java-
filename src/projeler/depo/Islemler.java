package projeler.depo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Islemler {
    Scanner scan = new Scanner(System.in);

    List<UrunBilgileri> detaylar = new ArrayList<>();

    static int idNo=1000;
    int count=0;
    int sayac=0;

    public List<UrunBilgileri> urunTanimlama(){


        System.out.println("tanimlamak istediginiz urun bilgilerini giriniz");
        System.out.println("urun ismi ?");
        String urun = scan.next();
        System.out.println("Uretici ?");
        String urt=scan.next();
        System.out.println("Birim ?");
        String brm=scan.next();
        idNo+=1;
        UrunBilgileri detay=new UrunBilgileri(idNo,urun,urt,brm);
        detaylar.add(detay);
        return detaylar;
    }

    public void urunListele(List<UrunBilgileri> detaylar){

       if (!detaylar.isEmpty()){



           for (int i = 0; i < detaylar.size(); i++) {

               System.out.println(detaylar.get(i));
           }
           }else{
           System.out.println("Sistemde tanimlanmis urun yoktur\nOnce urun tanimlamasi yapiniz");
       }



    }

    public List<UrunBilgileri> urunGirisi(List<UrunBilgileri> detaylar){

        if (!detaylar.isEmpty()) {

            while (count < 1) {
                System.out.println("Lutfen giris yapmak istediginiz urunun Id No girin");
                int arananId = scan.nextInt();

                for (int i = 0; i < detaylar.size(); i++) {

                    if (detaylar.get(i).id == arananId) {

                        System.out.println("Lutfen giris yapmak istediginiz miktari girin");

                        detaylar.get(i).miktar += scan.nextInt();

                        System.out.println("Giris islemi tamamlandi\n\n");

                        count++;
                    }

                }
                if (count == 0) {
                    System.out.println("hatali ID no");
                }
            }
            count = 0;
        }else{
            System.out.println("Sistemde tanimlanmis urun yoktur\nOnce urun tanimlamasi yapiniz");
        }

        return detaylar;


    }
    public List<UrunBilgileri> urunRafaKoy(List<UrunBilgileri> detaylar){

        if (!detaylar.isEmpty()) {
            while (count < 1) {

                System.out.println("Lutfen urunun ID bilgisini girin");
                int arananId = scan.nextInt();
                for (int i = 0; i < detaylar.size(); i++) {
                    if (detaylar.get(i).id == arananId) {


                        System.out.println("Lutfen raf bilgisi girin");

                        detaylar.get(i).raf = scan.next();
                        System.out.println("raf bilgisi girildi\n\n");
                        count++;
                    }

                }
                if (count == 0) {
                    System.out.println("hatali ID no");
                }
            }
            count = 0;

        }else{
            System.out.println("Sistemde tanimlanmis urun yoktur\nOnce urun tanimlamasi yapiniz");
        }
        return detaylar;
    }
    public List<UrunBilgileri> urunCikisi(List<UrunBilgileri> detaylar){

        if (!detaylar.isEmpty()) {
            while (count < 1) {

                System.out.println("Lutfen urunun ID bilgisini girin");
                int arananId = scan.nextInt();
                for (int i = 0; i < detaylar.size(); i++) {
                    if (detaylar.get(i).id == arananId) {
                        count++;

                        while (sayac < 1) {
                            System.out.println("Lutfen cikis yapilacak miktari girin");

                            int mkt = scan.nextInt();
                            if (detaylar.get(i).miktar - mkt < 0) {
                                System.out.println("Depoda o kadar " + detaylar.get(i).urunIsmi + " bulunmamaktadir");
                            } else {
                                detaylar.get(i).miktar -= mkt;
                                System.out.println("cikis yapildi\n\n");
                                sayac++;
                            }

                        }sayac = 0;

                    }

                }
                if (count == 0) {
                    System.out.println("Hatali ID no");
                }
            }count=0;
        }else {
            System.out.println("Sistemde tanimlanmis urun yoktur");

        }
        return detaylar;
    }














    public List<UrunBilgileri> getDetaylar() {
        return detaylar;
    }

    public void setDetaylar(List<UrunBilgileri> detaylar) {
        this.detaylar = detaylar;
    }
}
