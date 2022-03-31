package calismalar;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        /*
        Scanner class aracılığıyla girilen herhangi bir sayının faktöriyel değerini bulmak için bir program yazın.

        number:6
        factorial:1*2*3*4*5*6=720
        output ---> 720


         */

        Scanner dp = new Scanner(System.in);
        System.out.println("sayi giriniz");

        String strNum = dp.nextLine();
        int number = Integer.parseInt(strNum);
        int faktöriyel=1;

        for (int i = number; i >0 ; i--) {
            faktöriyel *=i;

        }
        System.out.println(faktöriyel);







    }

}
