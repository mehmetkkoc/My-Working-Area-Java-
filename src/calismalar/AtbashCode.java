package calismalar;

import java.util.Arrays;
import java.util.List;

public class AtbashCode {
    /*
      AtbashCode ; bir metni şifrelemek veya şifresini çözmek için İbrani alfabesine temelli basit bir yöntemdir.
      Alfabenin ilk harfi son harfi yerine kullanilmaktadir..
      "abcdefghijklmnopqrstuvwxyz"; 26 harf
      "zyxwvutsrqponmlkjihgfedcba";
     */
    public static void main(String[] args) {

        String cumle ="ABCDEFG";

        atbashCode(cumle);
    }

    private static void atbashCode(String cumle) {
        String arr[]=cumle.split("");
        List<String> liste=Arrays.asList(arr);
        System.out.println("Girilen metin : "+ cumle);
        String alfabe="abcdefghijklmnopqrstuvwxyz";
        String atbash="zyxwvutsrqponmlkjihgfedcba";

        System.out.print("Atbash code ile yazilisi : ");
        for (int i = 0; i < liste.size() ; i++) {
            for (int j = 0; j <alfabe.length(); j++) {
                if (liste.get(i).equalsIgnoreCase(alfabe.substring(j,j+1))){
                    liste.set(i,atbash.substring(j,j+1));
                    System.out.print(liste.get(i));
                    break;

                }
            }

        }


    }
}
