import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class UcusProjesi {
    /*
    A şehrinden uçmak isteyen bir yolcu B şehrine 500km C şehrine  700km  D şehrine  900 km mesafededir.
    Bilet tarifesi:
    km birim fiyati : 0.10$
    yolcu 12 yasindan kucukse toplam fiyat %50 indirim,
    12 ve 24 yas arasindaysa 10% indirim,
    65 yasindan buyukse 30% indirim,
    bilet gidis donus alinirrsa 20% indirim uygulayan bi app create ediniz

 */
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Luten Ucus Bilgilerini Giriniz");
        System.out.println("Yolculuk Yapmak Istediginiz Sehrin numarasini girin\n1 - NEWYORK\n2 - CHICAGO\n3 - SAN FRANCISCO");
        int sehir=scan.nextInt();
        if (sehir<1 || sehir>3){
            System.out.println("Sehir Girisi Hatali\nLutfen Seceneklerden birini secin");
            System.out.println("Yolculuk Yapmak Istediginiz Sehrin numarasini girin\n1 - NEWYORK\n2 - CHICAGO\n3 - SAN FRANCISCO");
            sehir=scan.nextInt();
        }         // Sehir Girisini Hatali Yapmasi Durumunda Islem Ilerlemeyecek
        System.out.println("Kac Kisi");
        int adet=scan.nextInt();
        int yasGirilen=0;
        double toplamFiyat=0;
        List<Integer> yas=new ArrayList<Integer>();

        yasOlustur(adet,yasGirilen,yas);    // Girilen yaslari list e aktarmak icin

        fiyatGetir(sehir,yas,toplamFiyat);  // Tum veriler degerlendirilerek odenecek toplam tutar cikariliyor

    }

    private static void fiyatGetir(int sehir, List<Integer> yas, double toplamFiyat) {

        double birim=0.10;
        int count=0;
        int sayac=0;
        while(count<yas.size()) {

            if (sehir==1){
                if (yas.get(count)<12){
                    toplamFiyat+=(500*birim*0.5);
                }else if (yas.get(count)<24){
                    toplamFiyat+=(500*birim*0.9);
                }else if (yas.get(count)>65){
                    toplamFiyat+=(500*birim*0.7);
                }else if(yas.get(count)>23 && yas.get(count)<66){
                    toplamFiyat+=(500*birim);
                }
                count++;
            }
            else if (sehir==2){
                if (yas.get(count)<12){
                    toplamFiyat+=(700*birim*0.5);
                }else if (yas.get(count)<24){
                    toplamFiyat+=(700*birim*0.9);
                }else if (yas.get(count)>65){
                    toplamFiyat+=(700*birim*0.7);
                }else if(yas.get(count)>23 && yas.get(count)<66){
                    toplamFiyat+=(700*birim);
                }
                count++;
            }else if (sehir==3) {
                if (yas.get(count) < 12) {
                    toplamFiyat += (900 * birim * 0.5);
                } else if (yas.get(count) < 24) {
                    toplamFiyat += (900 * birim * 0.9);
                } else if (yas.get(count) > 65) {
                    toplamFiyat += (900 * birim * 0.7);
                } else if (yas.get(count) > 23 && yas.get(count) < 66) {
                    toplamFiyat += (900 * birim);
                }
                count++;
            }

        }       // Hangi sehir ve kac yas indirimi oldugu uygulaniyor
        while (sayac<1) {
            System.out.println("1 - Gidis-Donus\n2 - Tek Yon");
            int gidisDonus = scan.nextInt();

            if (gidisDonus == 1) {
                toplamFiyat = toplamFiyat*2*0.8;
                sayac++;

            } else if (gidisDonus == 2) {
                sayac++;

            } else {
                System.out.println("hatali giris yaptiniz");

            }
        }               // Olusan toplam tutar uzerinden Gidis-Donus indirimi uygulaniyor


        System.out.println(yas.size()+" Kisi Icin Toplam Odemeniz Gereken Tutar : "+toplamFiyat +" $");
    }

    private static void yasOlustur(int adet,int yasGirilen,List<Integer> yas) {

        for (int i = 0; i <adet ; i++) {
            System.out.println((i+1)+". Yolcu Yasi?");
            yasGirilen= scan.nextInt();
            yas.add(yasGirilen);
        }
    }
}
