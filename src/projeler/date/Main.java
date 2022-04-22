package projeler.date;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Kayit kayit = new Kayit();
        List<Kullanici> kisi = new ArrayList<>();

        int islem;

        boolean devam = false;

        while (!devam) {
            System.out.println("Lutfen islem giriniz");
            System.out.println("1 - Kayit Giris\n2 - Sanli Kisi Gorme\n3 - Listele\n4 - Cikis");
            islem = scan.nextInt();

            switch (islem) {
                case 1:
                    kisi=kayit.kayitAl();
                    break;
                case 2:
                    kayit.sansliKullanici(kisi);
                    break;
                case 3:
                    kayit.listele(kisi);
                    break;
                case 4:
                    devam=true;
                    break;
                default:
                    System.out.println("hatali giris");
                    break;
            }


        }
    }

}
