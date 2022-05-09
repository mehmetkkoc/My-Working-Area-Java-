package projeler.okulYonetimi.veriYonetimi;

import java.util.*;

public class Ogretmen extends Kisi implements Islemlerim{

    String bolum="bolum yok";
    String sicil="sicil yok";

    static Map<String,String> ogretmenler=new HashMap<>();

    Scanner scan=new Scanner(System.in);

    String sicilNo="";

    @Override
    public void islemler() {
        System.out.println("======ISLEMLER======\n1 - EKLEME\n2 - ARAMA\n3 - LISTELEME\n4 - SILME\n5 - ANA MENU\nQ - CIKIS");
        char secim= scan.next().toUpperCase().charAt(0);
        switch(secim){
            case '1':
                ekleme();
                islemler();
                break;
            case '2':
                arama();
                islemler();
                break;
            case '3':
                listeleme();
                islemler();
                break;
            case '4':
                silme();
                islemler();
                break;
            case '5':
                Islemler.anaMenu();
                break;
            case 'Q':
                Islemler.cikis();
                break;
            default:
                System.out.println("Hatali Giris\n\nTekrar Deneyin");
                islemler();
                break;

        }
    }

    @Override
    public Map<String, String> ekleme() {
        Kisi ogretmen = new Kisi();

        System.out.print("Isim : ");
        ogretmen.ad=scan.next();
        System.out.print("Soyisim : ");
        ogretmen.soyad=scan.next();
        System.out.print("Tckn : ");
        ogretmen.kimlikNo=scan.next();
        System.out.print("Yas : ");
        ogretmen.yas=scan.next();
        System.out.print("Sicil : ");
        sicil=scan.next();
        System.out.print("Bolum : ");
        bolum=scan.next();
        String arr[] ={ogretmen.ad, ogretmen.soyad, ogretmen.kimlikNo, ogretmen.yas, bolum};
        ogretmenler.put(sicil, Arrays.toString(arr));




        return ogretmenler;
    }



    @Override
    public void arama() {
        System.out.print("Sicil No : ");
        sicilNo=scan.next();
        if (ogretmenler.containsKey(sicilNo)){
            System.out.println("Sicil No     Isim     Soyisim    TCKN          Yas   Bolum ");
            System.out.println("____________________________________________________");
            String arr1[]=ogretmenler.get(sicilNo).split(", ");
            System.out.printf( "%-12s %-8s %-10s %-13s %-5s %s\n" , sicilNo, arr1[0].toString().substring(1), arr1[1], arr1[2], arr1[3],arr1[4].toString().substring(0,arr1[4].length()-1));
            System.out.println("____________________________________________________");
        }else{
            System.out.println("Girilen no ya sahip ogrenci bulunamadi");
        }


    }




    @Override
    public void listeleme() {

        Set<Map.Entry<String,String>> sinifEntrySeti = ogretmenler.entrySet();
        System.out.println("Sicil No     Isim     Soyisim    TCKN          Yas   Bolum  ");
        System.out.println("__________________________________________________________");
        for (Map.Entry<String,String> each: sinifEntrySeti
        ) {
            String entryKey= each.getKey();
            String valueStr= each.getValue();
            String valueArr[]=valueStr.split(", ");

            System.out.printf( "%-12s %-8s %-10s %-13s %-5s %s\n" , entryKey, valueArr[0].toString().substring(1), valueArr[1], valueArr[2], valueArr[3], valueArr[4].toString().substring(0,valueArr[4].length()-1));
        }
        System.out.println("__________________________________________________________");
    }




    @Override
    public void silme() {
        System.out.print("Sicil no : ");
        sicilNo=scan.next();
        if (ogretmenler.containsKey(sicilNo)){
            ogretmenler.remove(sicilNo);
        }

    }




}
