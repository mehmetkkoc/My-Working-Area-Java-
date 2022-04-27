package calismalar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HarfTekrarSayisi {
    public static void main(String[] args) {

        String cumle = "AAABBCDD";

        tekrarSayisi(cumle);

    }

    private static void tekrarSayisi(String cumle) {

        String arr[] = cumle.split("");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        List<String> liste = List.of(arr);
        System.out.println(liste);

        int count = 1;
       for (int i = 1; i < liste.size(); i++) {

           if (liste.get(i).equalsIgnoreCase(liste.get(i - 1))) {

               count++;

           } else {
               System.out.println(liste.get(i-1)+" "+count+" adet");
               count=1;

           }

       }
        System.out.println(liste.get(liste.size()-1)+" "+count+" adet");

    }
}
