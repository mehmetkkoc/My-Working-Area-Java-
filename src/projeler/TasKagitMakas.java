package projeler;

import java.util.Random;
import java.util.Scanner;

public class TasKagitMakas {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int kullaniciPuani = 0;
        int pcPuani = 0;
        int kullanıcıSecim = 0;
        Random rnd = new Random();


        String devam = "evet";

        while (devam.equalsIgnoreCase("evet")) {
            System.out.println("1 - Tas 2 - Kagit 3 - Makas");
            System.out.println("Seciminizi Yapin");

            kullanıcıSecim = scan.nextInt();

            int pcSecim = rnd.nextInt(1,4);
            System.out.println(pcSecim);

            if (kullanıcıSecim == 1) {
                if (pcSecim == 1) {
                    System.out.println("Seciminiz: Tas      PC: Tas ");
                    System.out.println("Ayni Secim Berabere");
                } else if (pcSecim == 2) {
                    pcPuani++;
                    System.out.println("Seciminiz: Tas      PC: Kagit ");
                    System.out.println("Skor ==> " + kullaniciPuani + "  -  " + pcPuani);


                } else {
                    kullaniciPuani++;
                    System.out.println("Seciminiz: Tas      PC: Makas");
                    System.out.println("Skor ==> " + kullaniciPuani + "  -  " + pcPuani);
                }
            } else if (kullanıcıSecim == 2) {
                if (pcSecim == 1) {
                    kullaniciPuani++;
                    System.out.println("Seciminiz: Kagit      PC: Tas ");
                    System.out.println("Skor ==> " + kullaniciPuani + "  -  " + pcPuani);
                } else if (pcSecim == 2) {

                    System.out.println("Seciminiz: Kagit      PC: Kagit ");
                    System.out.println("Ayni Secim Berabere");

                } else  {
                    pcPuani++;
                    System.out.println("Seciminiz: Kagit      PC: Makas");
                    System.out.println("Skor ==> " + kullaniciPuani + "  -  " + pcPuani);
                }
            } else if (kullanıcıSecim == 3) {
                if (pcSecim == 1) {
                    pcPuani++;
                    System.out.println("Seciminiz: Makas      PC: Tas ");
                    System.out.println("Skor ==> " + kullaniciPuani + "  -  " + pcPuani);
                } else if (pcSecim == 2) {
                    kullaniciPuani++;
                    System.out.println("Seciminiz: Makas      PC: Kagit ");
                    System.out.println("Skor ==> " + kullaniciPuani + "  -  " + pcPuani);

                } else  {

                    System.out.println("Seciminiz: Makas      PC: Makas");
                    System.out.println("Ayni Secim Berabere");
                }
            } else {
                System.out.println("Hatali Giris");
                continue;
            }


            if (kullaniciPuani == 3) {
                System.out.println("siz Kazandiniz");
                System.out.println("Skor ==> Siz:" + kullaniciPuani + "  -  PC: " + pcPuani);

                System.out.println("Devam mi? Evet/Hayir");
                devam = scan.next();
                if (devam.equalsIgnoreCase("evet")) {
                    kullaniciPuani=0;
                    pcPuani=0;
                }
            } else if (pcPuani == 3) {
                System.out.println("Kaybettiniz");
                System.out.println("Skor ==> Siz: " + kullaniciPuani + "  -  PC: " + pcPuani);

                System.out.println("Devam mi? Evet/Hayir");
                devam = scan.next();
                if (devam.equalsIgnoreCase("evet")) {
                    kullaniciPuani=0;
                    pcPuani=0;

                }


            }

        }
    }}
