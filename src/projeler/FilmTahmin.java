package projeler;

import java.util.*;

public class FilmTahmin {
    static List<String> film = new ArrayList<>(Arrays.asList("JOKER", "INCEPTION", "PIYANIST", "GREENMILE", "LEON", "GODFATHER", "JURASSICPARK", "TITANIC"));


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("~~~FILM TAHMIN OYUNUNA HOSGELDINIZ~~~");

        System.out.println("1-" + (film.size()) + " arasinda bir sayi giriniz");
        int sira = scan.nextInt();
        int hak = film.get(sira - 1).length() * 2;
        //String kapali=film.get(sira-1).replaceAll("\\w","-");
        //System.out.println(kapali);
        List<Character> aranan = new ArrayList<>();
        for (int i = 0; i < film.get(sira - 1).length(); i++) {           // Gereksiz Dongu
            aranan.add('-');
        }
        System.out.println(aranan);

        System.out.println("Tuyo : Film ismi " + (film.get(sira - 1).length()) + " harfli");
        System.out.println("Kural: Tahmin Hakki " + hak + " adettir");
        int dogruSayac = 0;
        int yanlisSayac = 0;
        char tahmin;


        while (yanlisSayac <= hak) {
            System.out.println("Tahmininizi Giriniz");
            tahmin = scan.next().toUpperCase().charAt(0);

            for (int i = 0; i < aranan.size(); i++) {

                if (film.get(sira - 1).charAt(i) == tahmin) {
                    aranan.set(i, tahmin);
                }
            }
            if (aranan.contains(tahmin)) {
                dogruSayac++;

            } else {
                yanlisSayac++;

            }


            if (aranan.toString().equalsIgnoreCase(film.get(sira - 1))) {
                System.out.println("\n\n***** " + film.get(sira - 1) + " *****");
                System.out.println("\n***//*/  TEBRIKLER  \\\\***\n\n\n");
                break;
            } else if (yanlisSayac == hak) {
                System.out.println("\n\n--- GAME OVER --- \n\n\nDogru cevap : (((  " + film.get(sira - 1) + "  ))) olacakti");
                break;
            } else {
                System.out.println(aranan);
                System.out.println("Dogru tahmin : " + dogruSayac + " Yanlis tahmin : " + yanlisSayac);
                System.out.println("Kalan Tahmin Hakkiniz : " + (hak - yanlisSayac));
            }


       /* adamAsmaca(sira,hak);

    }

    private static void adamAsmaca(int sira, int hak) {
        Scanner scan=new Scanner(System.in);
        List<Character> aranan = new ArrayList<>();
        List<Character> acik = new ArrayList<>();                        // Gereksiz satir
        for (int i = 0; i < film.get(sira - 1).length(); i++) {
            acik.add(film.get(sira - 1).charAt(i));
        }
        for (int i = 0; i < film.get(sira - 1).length(); i++) {           // Gereksiz Dongu
            aranan.add('-');
        }
        System.out.println(film.get(sira-1).replaceAll("//w","-"));


        System.out.println("Tuyo : Film ismi " + (film.get(sira - 1).length()) + " harfli");
        System.out.println("Kural: Tahmin Hakki " + hak + " adettir");
        int dogruSayac = 0;
        int yanlisSayac = 0;
        Character tahmin;


        while (yanlisSayac <= hak) {
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
                System.out.println("\n\n***** "+film.get(sira - 1)+" *****");
                System.out.println("\n***//*/  TEBRIKLER  \\\\***\n\n\n");
                break;
            }else if (yanlisSayac == hak) {
                System.out.println("\n\n--- GAME OVER --- \n\n\nDogru cevap : (((  " + film.get(sira - 1) + "  ))) olacakti");
                break;
            }
            else {
                System.out.println(aranan);
                System.out.println("Dogru tahmin : " + dogruSayac + " Yanlis tahmin : " + yanlisSayac);
                System.out.println("Kalan Tahmin Hakkiniz : " + (hak - yanlisSayac));
            }

        }*/

        }
    }
}




