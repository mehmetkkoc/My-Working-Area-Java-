package calismalar;

import java.util.Scanner;

public class PerfectSquare {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Bir Sayi Giriniz");
        int sayi=scan.nextInt();
boolean tamkare = false;
        for (int i = 1; i <sayi ; i++) {
            if (i*i==sayi){
               tamkare = true;
            }

        }
        if (tamkare){
            System.out.println("Tamkare");
        }  else {
            System.out.println("Tamkare Degil");
        }








    }
}
