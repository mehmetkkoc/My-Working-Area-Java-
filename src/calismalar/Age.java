package calismalar;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        /*
           Eğer age 10 dan küçük veya eşit ise
           facebook hesabi acmak icin cok gencsin print yapın.

           Eğer age 16 dan küçük veya eşit ise
           ehliyet almak icin cok gencsin print yapın.

           Eğer age 18 den küçük veya eşit ise
           dovme yaptirmak icin cok gencsin print yapın.

           Eğer age 21 den küçük veya eşit ise
           alkol icmek icin cok gencsin print yapın.

           Eğer age 21 den büyük ise
           istedigini yapabilirsin print yapın.
 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        int age = scan.nextInt();
        if (age<0){
            System.out.println("hatali giris");
        }else if (age<=10) {
            System.out.println("facebook hesabi acmak icin cok gencsin");
        }else if (age<=16){
            System.out.println("ehliyet almak icin cok gencsin");
        }else if (age<=18){
            System.out.println("dovme yaptirmak icin cok gencsin");
        }else if (age<=21){
            System.out.println("alkol icmek icin cok gencsin");
        }else {
            System.out.println("istedigini yapabilirsin");
    }
}}
