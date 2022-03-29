import java.util.Scanner;

public class CountE {
    /*  Kullanıcı tarafından girilen inputda kac tane 'b' karakteri olduğunu belirle ve print et.

     input: Test output
            b: 0
        output 0 olmalı


     input: bucket
            b:1
        output 1 olmalı
        */


    //hint: .charAt, length(), for, index, counter,


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("metin girin");
        String text = input.nextLine().toLowerCase();
        int sayac=0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i)=='b'){
                sayac++;
            }
        }
        System.out.println("b adedi : "+sayac);

}}
