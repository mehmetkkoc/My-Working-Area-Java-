package projeler;

import java.util.*;

public class KahveMakinesi {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<String> kahve = new ArrayList<String>(Arrays.asList("1 - Turk Kahvesi", "2 - Filtre Kahve", "3 - Espresso"));

        int secimKahve =0;
        int secimSut  =0;
        int secimSeker =0;
        int secimBoy  =0;
        int kacSeker = 0;
        int count = 0;


        while (count < 1) {
            System.out.println("Lutfen Kahve Turunu Seciniz");
            System.out.println(kahve);
            secimKahve = scan.nextInt();

            if (secimKahve<1 || secimKahve>3){
                System.out.println("Hatali Secim Yapildi\n Yeniden Dene");
            }else{
                System.out.println(kahve.get(secimKahve-1) + " Hazirlaniyor");
                count++;
            }

        } // Kahve Secimi
        count = 0;

        while (count < 1) {
            System.out.println("Sut Ister misniz?  1 - Evet / 2 - Hayir");
            secimSut = scan.nextInt();
            if (secimSut==1) {
                count++;
                System.out.println("Sut Ekleniyor");
            } else if (secimSut==2) {
                System.out.println("Sut Eklenmiyor");
                count++;
            } else {
                System.out.println("Hatali Giris\nTekrarlayin");

            }
        } // Sut Secimi
        count = 0;

        while (count < 1) {
            System.out.println("Seker Ister misiniz? 1 - Evet / 2 - Hayir");
            secimSeker = scan.nextInt();
            if (secimSeker==1) {
                count++;
                System.out.println("Kac Seker?");
                kacSeker = scan.nextInt();
                System.out.println(kacSeker + " ad seker ekleniyor");
            } else if (secimSeker==2) {
                count++;
                System.out.println("Seker eklenmiyor");
            } else {
                System.out.println("Secim Hatali\nTekrar Dene");
            }
        } // Seker Secimi
        count = 0;

        while (count < 1) {
            System.out.println("Hangi Boy?\n 1 - Buyuk - 2 - Orta - 3 - Kucuk");
            secimBoy = scan.nextInt();
            if (secimBoy==1) {
                count++;
                System.out.println("Buyuk Boy Hairlaniyor");
            } else if (secimBoy==2) {
                count++;
                System.out.println("Orta Boy Hairlaniyor");
            }else if (secimBoy==3) {
                count++;
                System.out.println("Kucuk Boy Hairlaniyor");
            }else{
                System.out.println("Boyutta hata var\nTekrar Lutfen");
            }
        } // Boyut Secimi
        count = 0;

        System.out.println(kahve.get(secimKahve-1).substring(4)+" hazirdir\nAfiyet Olsun");

    }
}
