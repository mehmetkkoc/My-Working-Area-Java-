package calismalar;

public class MultipleMethodVarargs {
    public static void main(String[] args) {
         /*
	Problem Tanımı :
	farklı 4 öğrencinin sırasıyla 6,4,3 ve 5 yazılı notlarının ortalamasını
	yazdıran parametreli method yazınız
 */
        ortalamaBul("Ahmet",90,80,95,100,80,90);
        ortalamaBul("Akif",100,90,95,80);
        ortalamaBul("Funda",90,95,92);
        ortalamaBul("Mehmet",70,65,80,90,85);

    }

    private static void ortalamaBul(String isim, double... notlar ) {
        double toplam=0;
        for (double each: notlar
             ) {
            toplam+=each;
        }
        double ortalama = toplam/notlar.length;

        System.out.println(isim+" adli ogrencinin not ortalamasi "+ortalama);

    }
}
