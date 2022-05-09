package interveiw;

public class Q06_ArmstrongNumber {
    public static void main(String[] args) {
        /*  soru1: Check if the integer is an Armstrong numbers to 4 digit numbers(4 digit-> exclusive)
        Armstrong sayi:herhangi bir 3 basamakli sayinin rakamlarinin kupleri toplami o sayiyi veriyorsa sayi  Armstrong sayidir
            (0, 1, 153, 370, 371, 407)
            153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
            370 = 3*3*3 + 7*7*7 + 0*0*0 = 370

          soru2: Birden baslayarak girilen sayıya kadar her bir tamsayının amstrong sayı olup olmadıgını
          gösteren program yazınız */
        int sayi = 900;
        int birler =0;
        int onlar = 0;
        int yuzler =0;


        for (int i = 100; i < sayi; i++) {

            birler = i % 10;
            onlar = (i / 10) % 10;
            yuzler = (i / 100);
            if (Math.pow(birler, 3) + Math.pow(onlar, 3) + Math.pow(yuzler, 3) == i) {
                System.out.println(i+ " sayisi bir armstrong sayidir");
            }
        }
    }
}
