package calismalar;

public class PermutasyonKombinasyon {
    /*  Problem Tanımı
            Verilen iki sayının kombinasyonunu bulan kodu yazınız.
            Hatırlatma C(n,r) = n! / (r!(n-r)!)

            Verilen iki sayının permütasyonunu bulan kodu yazınız.
            Hatırlatma P(n,r) = n! / (n-r)!

            Ekran Çıktısı
            Birinci sayıyı giriniz: 15
            Ikinci sayıyı giriniz: 4
            Kombinasyon: 1365
            permütasyon: 32760

            Birinci sayıyı giriniz: 5
            Ikinci sayıyı giriniz: 3
            Kombinasyon: 10
            permütasyon: 60
          */
    public static void main(String[] args) {

        int sayi1=5;
        int sayi2=3;

        double faktoriyel1=1;
        double faktoriyel2=1;
        double faktoriyel3=1;

        for (int i = 1; i <=sayi1 ; i++) {
            faktoriyel1*=i;
        }
        for (int i = 1; i <=sayi2 ; i++) {
            faktoriyel2*=i;
        }
        for (int i = 1; i <=sayi1-sayi2 ; i++) {
            faktoriyel3*=i;
        }

        System.out.println("Kombinasyon : "+(faktoriyel1/(faktoriyel2*faktoriyel3)));

        System.out.println("Permutasyon : "+(faktoriyel1/(faktoriyel3)));
    }
}
