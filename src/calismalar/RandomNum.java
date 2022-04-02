package calismalar;

import java.util.Random;

public class RandomNum {
    public static void main(String[] args) {


        randomNumberCreate();
        randomNumberBetweemTwoNumbersCreate();




     }

    private static void randomNumberBetweemTwoNumbersCreate() {
        int sayiMax = 100;
        int sayiMin = 90;
        Random rnd = new Random();
        int rastgele=rnd.nextInt(sayiMin,sayiMax);
        System.out.println(rastgele);
    }

    private static void randomNumberCreate() {
        int sayi = 10;
        Random rnd = new Random();
        int rastgele=rnd.nextInt(sayi);
        System.out.println(rastgele);
    }
}