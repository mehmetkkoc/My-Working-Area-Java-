package interveiw;

import java.util.Scanner;

public class Q03_PrimeNumber {
    public static void main(String[] args) {

    /*
    Ask user enter a positive number and check if it is prime or not
    Kullanıcıdan pozitif bir sayı girmesini isteyin ve asal olup olmadığını kontrol edin
     */

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayi giriniz :");
        int sayi = scan.nextInt();

        boolean asalMi= true;

        for (int i = 2; i <=sayi/2 ; i++) {
            if (sayi%i==0){
                asalMi = false;
            }

        }
        if (asalMi){
            System.out.println("Asal");
        }else {
            System.out.println("asal degil");
        }


    }
}
