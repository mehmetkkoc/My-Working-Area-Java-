package projeler;

import java.util.*;

public class KahveMakinesi {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<String> kahve = new ArrayList<String>(Arrays.asList("Turk Kahvesi", "Filtre Kahve", "Espresso"));

        String secimKahve = "";
        String secimSut = "";
        String secimSeker = "";
        String secimBoy = "";
        int kacSeker = 0;
        int count = 0;


        while (count < 1) {
            System.out.println("Lutfen Kahve Turunu Seciniz");
            System.out.println(kahve);
            secimKahve = scan.nextLine();

            for (int i = 0; i < kahve.size(); i++) {
                if (kahve.get(i).equalsIgnoreCase(secimKahve)) {
                    count++;
                }

            }
            if (count == 1) {
                System.out.println(secimKahve + " Hazirlaniyor");
            } else {
                System.out.println("Hatali Secim Yapildi\n Yeniden Dene");
            }
        } // Kahve Secimi
        count = 0;

        while (count < 1) {
            System.out.println("Sut Ister misniz?  Evet / Hayir");
            secimSut = scan.next();
            if (secimSut.equalsIgnoreCase("evet")) {
                count++;
                System.out.println("Sut Ekleniyor");
            } else if (secimSut.equalsIgnoreCase("Hayir")) {
                System.out.println("Sut Eklenmiyor");
                count++;
            } else {
                System.out.println("Hatali Giris\nTekrarlayin");

            }
        } // Sut Secimi
        count = 0;

        while (count < 1) {
            System.out.println("Seker Ister misiniz? Evet / Hayir");
            secimSeker = scan.next();
            if (secimSeker.equalsIgnoreCase("evet")) {
                count++;
                System.out.println("Kac Seker?");
                kacSeker = scan.nextInt();
                System.out.println(kacSeker + " ad seker ekleniyor");
            } else if (secimSeker.equalsIgnoreCase("hayir")) {
                count++;
                System.out.println("Seker eklenmiyor");
            } else {
                System.out.println("Secim Hatali\nTekrar Dene");
            }
        } // Seker Secimi
        count = 0;

        while (count < 1) {
            System.out.println("Hangi Boy?\nBuyuk - Kucuk - Orta");
            secimBoy = scan.next();
            if (secimBoy.equalsIgnoreCase("buyuk") || secimBoy.equalsIgnoreCase("orta") || secimBoy.equalsIgnoreCase("kucuk")) {
                count++;
            } else {
                System.out.println("Boyutta hata var\nTekrar Lutfen");
            }
        } // Boyut Secimi
        count = 0;

        System.out.println(secimKahve+" "+secimBoy+" boy hazirdir\nAfiyet Olsun");

    }
}
