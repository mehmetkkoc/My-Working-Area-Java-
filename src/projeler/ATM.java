package projeler;

import java.util.Locale;
import java.util.Scanner;

public class ATM {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int sifre = 1234;
        int islem = 0;
        int count = 0;
        int bakiye = 1000;
        int tutar = 0;
        String iban = "";
        int secim = 0;
        int sayac = 0;


        musteriKarsila(sifre);

        islemleriYap(sifre, islem, count, bakiye, tutar, iban, secim, sayac);

    }

    private static void islemleriYap(int sifre, int islem, int count, int bakiye, int tutar, String iban, int secim, int sayac) {

        while (count < 1) {                             // Tum Islemleri Basa Dondurur

            System.out.println("Lutfen Yapmak Istediginiz Islemi Secin\n1 - Bakiye Sorgula  2 - Para Yatirma  3 - Para Cekme  4 - Para Gonderme  5 - Sifre Degistirme  6 - Cikis");
            islem = scan.nextInt();

            while (islem < 1 || islem > 6) {
                System.out.println("Islem Secim Isleminiz Hatali");
                System.out.println("Lutfen Yapmak Istediginiz Islemi Secin\n1 - Bakiye Sorgula  2 - Para Yatirma  3 - Para Cekme  4 - Para Gonderme  5 - Sifre Degistirme  6 - Cikis");
                islem = scan.nextInt();
            }       // Islem Secimi


            switch (islem) {
                case 1:
                    System.out.println("Hesap Bakiyeniz : " + bakiye + " TL\n");
                    count++;
                    break;
                case 2:
                    System.out.println("Yatirmak Istediginiz Tutari Giriniz");
                    tutar = scan.nextInt();
                    bakiye += tutar;
                    System.out.println("Para Yatirma Isleminiz Tamamlanmistir\n");
                    count++;
                    break;
                case 3:
                    while (sayac < 1) {
                        System.out.println("Cekmek Istediginiz Tutari Giriniz");
                        tutar = scan.nextInt();
                        if (tutar > bakiye) {
                            System.out.println("Cekilmek Istenen Tutar Bakiyeden Buyuktur");
                        } else {
                            bakiye -= tutar;
                            System.out.println("Para Cekme Isleminiz Tamamlanmistir\n");
                            sayac++;
                            count++;
                        }
                    }

                    break;

                case 4:
                    while (sayac < 1) {
                        System.out.println("Para Gondermek Istediginiz Iban'i Giriniz");
                        iban = scan.next().toUpperCase(Locale.ROOT);
                        iban = iban.replaceAll("\\s", "");
                        if (iban.length() == 26 && iban.startsWith("TR") && iban.replaceAll("\\D", "").length() == 24) {
                            sayac++;
                            while (count < 1) {

                                System.out.println("Lutfen Tutari Giriniz");
                                tutar = scan.nextInt();
                                if (tutar > bakiye) {
                                    System.out.println("Transfer Edilmek Istenen Tutar Bakiyeden Buyuktur");

                                } else {
                                    System.out.println("Transfer Isleminiz Basariyla Tamamlanmistir\n");

                                    bakiye -= tutar;
                                    count++;
                                }
                            }

                        } else {
                            System.out.println("Iban Hatali\nTekrar Deneyin");
                        }
                    }

                    break;
                case 5:
                    while (count < 1) {
                        System.out.println("Lutfen Yeni Sifreyi Giriniz");
                        int yeniSifre = scan.nextInt();
                        if (yeniSifre > 999 && yeniSifre < 10000) {
                            sifre = yeniSifre;
                            System.out.println("Sifre Degistirme Isleminiz Basari Ile Tamamlanmistir\n");
                            count++;
                        } else {
                            System.out.println("Hatali Giris\nSifre 4 Haneli Olmali");
                        }
                    }

                    break;
                case 6:
                    count++;
                    break;

            }                       // Islem Yapma




            sayac = 0;
            count = 0;
            while (sayac < 1) {
                System.out.println("Baska Bir Islem Yapmak Istiyor musunuz? \n1 - Evet\n2 - Hayir");
                secim = scan.nextInt();
                if (secim == 1) {
                    sayac++;
                    islem = 0;

                } else if (secim == 2) {
                    System.out.println("Iyi Gunler Dileriz");
                    sayac++;
                    count++;

                } else {
                    System.out.println("Hatali Secim Yaptiniz Tekrar Deneyin");


                }
            }                   // Vedalasma
            sayac = 0;
        }
    }

    // islem secme ve yapma Methodu

    private static void musteriKarsila(int sifre) {
        System.out.println("HOSGELDINIZ\nLutfen Kart No Giriniz");
        String kart = scan.nextLine();
        String kartNo = kart.replaceAll("\\D", "");

        while (kartNo.length() != 16) {
            System.out.println("hatali kart no girisi\nLutfen 16 haneli kart no giriniz");
            kart = scan.nextLine();
            kartNo = kart.replaceAll("\\D", "");

        }       // Kart no hatali olursa dogru giris olana kadar gonguye girecek

        System.out.println("Kartinizin Sifresini Giriniz");

        int sifreGirilen = scan.nextInt();
        while (sifre != sifreGirilen) {
            System.out.println("Sifre Hatali.....Tekrar Deneyin");
            sifreGirilen = scan.nextInt();

        }           // Sifre Hatali oldugunda dogru giris ister
    }  // Musteri Karsilama Methodu

}
