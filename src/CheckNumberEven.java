import java.util.Scanner;

public class CheckNumberEven {
     /*
        Veri tipi int olan number verildiğinde, number  çift mi tek mi kontrol et

        Eğer number çift ise  print true

        Eğer number tek ise  print false

        result true ya da false olmalı.

     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen sayi giriniz");

        int number = scanner.nextInt();

        boolean ciftMi =false;
        if (number%2==0){
            ciftMi =true;
            System.out.println(ciftMi);
        }else{
            System.out.println(ciftMi);

}}}

