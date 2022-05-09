package projeler.okulYonetimi.veriYonetimi;

import java.util.*;

public class Ogrenci implements Islemlerim{

    String no="";
    String sinif="sinif yok";

    static Map<String,String> ogrenciler=new HashMap<>();


    Scanner scan=new Scanner(System.in);

    int count=0;
    String stNo="";

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

        Kisi ogrenci = new Kisi();
        System.out.print("Isim : ");
        ogrenci.ad=scan.next();

        System.out.print("Soyisim : ");
        ogrenci.soyad=scan.next();
        while (count < 1) {
            System.out.print("TCKN : ");
            ogrenci.kimlikNo = scan.next();
            if (ogrenci.kimlikNo.length()==11 ){
                count++;
            }else {
                System.out.println("Hatali TCKN\n\nTekrar deneyin");
            }
        }count = 0;
        System.out.print("Yas : ");
        ogrenci.yas=scan.next();

        System.out.print("Ogrenci No : ");
        no=scan.next();

        System.out.print("Sinif : ");
        sinif=scan.next();

        String arr[] ={ogrenci.ad, ogrenci.soyad, ogrenci.kimlikNo, ogrenci.yas, sinif};
        ogrenciler.put(no, Arrays.toString(arr));



        return ogrenciler;

    }



    @Override
    public void arama() {
        System.out.print("Ogrenci No : ");
        stNo=scan.next();
        if (ogrenciler.containsKey(stNo)){
            System.out.println("No     Isim     Soyisim    TCKN          Yas   Sinif  ");
            System.out.println("____________________________________________________");
            String arr1[]=ogrenciler.get(stNo).split(", ");
            System.out.printf( "%-6s %-8s %-10s %-13s %-5s %s\n" , stNo, arr1[0].toString().substring(1), arr1[1], arr1[2], arr1[3],arr1[4].toString().substring(0,arr1[4].length()-1));
            System.out.println("____________________________________________________");
        }else{
            System.out.println("Girilen no ya sahip ogrenci bulunamadi");
        }


    }




    @Override
    public void listeleme() {

        Set<Map.Entry<String,String>> sinifEntrySeti = ogrenciler.entrySet();
        System.out.println("No     Isim     Soyisim    TCKN          Yas   Sinif  ");
        System.out.println("____________________________________________________");
        for (Map.Entry<String,String> each: sinifEntrySeti
        ) {
            String entryKey= each.getKey();
            String valueStr= each.getValue();
            String valueArr[]=valueStr.split(", ");

            System.out.printf( "%-6s %-8s %-10s %-13s %-5s %s\n" , entryKey, valueArr[0].toString().substring(1), valueArr[1], valueArr[2], valueArr[3], valueArr[4].toString().substring(0,valueArr[4].length()-1));
        }
        System.out.println("____________________________________________________");
    }





    @Override
    public void silme() {
        System.out.println("Ogrenci No : ");
        stNo=scan.next();
        if (ogrenciler.containsKey(stNo)){
            ogrenciler.remove(stNo);
        }

    }




}
