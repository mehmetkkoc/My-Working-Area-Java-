package projeler.date;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kayit {
    Scanner scan=new Scanner(System.in);
    List<Kullanici> kisiler = new ArrayList<Kullanici>();


   public List kayitAl(){
       Scanner scan=new Scanner(System.in);
       System.out.println("Lutfen isim giriniz");
       String isim= scan.nextLine();
       Kullanici k1=new Kullanici(isim,LocalDateTime.now());
       kisiler.add(k1);

       return kisiler;

   }
   public void sansliKullanici(List<Kullanici> kll){
       for(Kullanici k:kll) {
           if (k.kayitZamani.getSecond()<10){
               System.out.println(k.name+" sansli kisisiniz");
           }else{
               System.out.println("Maalesef Sansli kisi degilsiniz");
           }

       }


   }
   public void listele(List<Kullanici> kullanicilar){

       for(Kullanici k : kullanicilar){
           System.out.println("adi :"+k.name+" kayit zamani  : " +k.kayitZamani);
       }
   }

    @Override
    public String toString() {
        return "Kayit{" +
                "scan=" + scan +
                '}';
    }
}
