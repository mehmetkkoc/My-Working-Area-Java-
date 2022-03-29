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

    public static <Char> void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("~~~FILM TAHMIN OYUNUNA HOSGELDINIZ~~~");

        System.out.println("1-" + (film.size()) + " arasinda bir sayi giriniz");
        int sira = scan.nextInt();
        int hak = film.get(sira - 1).length() * 2;

        adamAsmaca(sira,hak);

    }

    private static void adamAsmaca(int sira, int hak) {
        Scanner scan=new Scanner(System.in);
        List<Character> aranan = new ArrayList<>();
        List<Character> acik = new ArrayList<>();
        for (int i = 0; i < film.get(sira - 1).length(); i++) {
            acik.add(film.get(sira - 1).charAt(i));
        }
        for (int i = 0; i < film.get(sira - 1).length(); i++) {
            aranan.add('#');
        }
        System.out.println(aranan);


        System.out.println("Tuyo : Film ismi " + (film.get(sira - 1).length()) + " harfli");
        System.out.println("Kural: Tahmin Hakki " + hak + " adettir");
        int dogruSayac = 0;
        int yanlisSayac = 0;
        Character tahmin;


        while (dogruSayac + yanlisSayac <= hak) {
            System.out.println("Tahmininizi Giriniz");
            tahmin = scan.next().charAt(0);
            for (int j = 0; j < aranan.size(); j++) {

                if (acik.get(j).equals(tahmin)) {
                    aranan.set(j, tahmin);
                }
            }
            if (acik.contains(tahmin)) {
                dogruSayac++;

            } else {
                yanlisSayac++;
            }
            if (aranan.equals(acik)) {
                System.out.println(aranan);
                System.out.println("Kazandiniz");
                break;
            } else {
                System.out.println(aranan);
                System.out.println("Dogru tahmin : " + dogruSayac + " Yanlis tahmin : " + yanlisSayac);
                System.out.println("Kalan Tahmin Hakkiniz : " + (hak - dogruSayac - yanlisSayac));
            }
            if (dogruSayac + yanlisSayac == hak) {
                System.out.println("kaybettiniz \nDogru cevap : " + acik + " olacakti");
                break;
            }
        }

    }
}



