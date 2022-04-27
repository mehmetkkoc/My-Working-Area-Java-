package calismalar;

public class CarpanlaraAyirma {
    /*
         Type java code by using while loop,
        Write a program to count the factors of an integer which is entered by user.
        Factors of 12 = 1, 2, 3, 4, 6, 12 ==> 6
        Factors of 8  = 1, 2, 4, 8 ==> 4
 */
    public static void main(String[] args) {

        int sayi=90;

        System.out.print(sayi+" sayisinin carpanlari : ");
        for (int i = 1; i < sayi; i++) {

            if (sayi%i==0){
                System.out.print(i+", ");
            }

        }
        System.out.println(sayi);

    }
}
