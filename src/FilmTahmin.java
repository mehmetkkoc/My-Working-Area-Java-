import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FilmTahmin {
    static List<String> film = new ArrayList<>(Arrays.asList("JOKER", "INCEPTION", "PIYANIST", "GREENMILE", "LEON", "GODFATHER", "JURASSICPARK", "TITANIC"));

        /*
 TASK :
  yukarıdaki film listinde bulunan filmlerden herhangi birisini kullanıcının filim ismini  görmeden
  filmin index nosuna göre sectiriniz
  seçilen filmin  ismini filmin harf saysının 2 katı kadar hak tanıyarak tahmin etmesini
  sağlayan method create ediniz...
  Ahanda TRICK...
  kullanıcının sectiği filmin harf sayısını  console yazdırınız.
  kullanıcının sectiği film için tahmin hakkını  console yazdırınız.
  kullanıcının her tahmininde kalan hak sayısını console yazdırınız.
  kullanıcının her tahmininde doğru ve yanlış tahmin  sayısını console yazdırınız.
  kullanıcının kaybedip veya kazandığını ve tahmin etmesi gereken filmin ismini  console yazdırınız.

 */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("~~~FILM TAHMIN OYUNUNA HOSGELDINIZ~~~");

        System.out.println("1-" + (film.size()) + " arasinda bir sayi giriniz");
        int sira=scan.nextInt();
        int hak=film.get(sira-1).length()*2;
        System.out.println("Tuyo : Film ismi "+(film.get(sira-1).length())+" harfli");
        System.out.println("Kural: Tahmin Hakki "+hak+" adettir");
        int sayac=0;
        String tahmin="";
        while (sayac<hak){
            System.out.println("Tahmininizi Giriniz");
            tahmin= scan.next();
            sayac++;
            if (tahmin.equalsIgnoreCase(film.get(sira-1))){
                System.out.println("Tebrikler \n"+film.get(sira-1)+" filmini "+sayac+" denemede bildiniz");
                break;
            }else{
                System.out.println("Bilemediniz \n"+sayac+". yanlis tahmin\nKalan Tahmin Hakkiniz : "+(hak-sayac));
            }
        }
        if (sayac==hak){
            System.out.println("kaybettiniz \nDogru cevap : "+film.get(sira-1)+" olacakti");
        }
    }
}
