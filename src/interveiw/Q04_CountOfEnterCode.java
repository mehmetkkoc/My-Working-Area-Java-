package interveiw;

import java.util.Scanner;

public class Q04_CountOfEnterCode {
    // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String giris="";
        String pin = "said.12345";
        int girisHakki =1;
        while (girisHakki<5){
            System.out.println("lutfen pin girin");
            giris = scan.nextLine();

            if (giris.equals(pin)){
                System.out.println("pin dogrulandi");
                break;
            }else {
                System.out.println("pin dogrulanmadi");
                girisHakki++;
            }

        }
        if (girisHakki==5){
            System.out.println("hatali giris sayisina ulastiginizdan pin bloke oldu ");
        }



    }
}