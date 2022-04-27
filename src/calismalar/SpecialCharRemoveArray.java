package calismalar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class SpecialCharRemoveArray {
     /*
   Problem Tanımı :
   getSum isminde bir method oluşturun.
   Parametresi ArrayList'tir.
   Dizideki tüm $ ları kaldır ve tüm sayıları topla
   return yaptğımız veri tipi 'int' olmalıdır.
   sonuç 0'dan küçükse, -1 yazdırın.

   Örnek1:
   ArrayList = $13, $15, $20
   Cevap = 48 olmalı

   Örnek 2 :
   ArrayList= $-13, $0, $0
   Cevap = -1 olmalı.
    */
     public static void main(String[] args) {

         List<String> liste=new ArrayList<>(Arrays.asList("$13", "$15", "$20"));
         //ArrayList<String> liste = new ArrayList<>(Arrays.asList("$13", "$15", "$-30"));
         int toplam=0;

         toplam=getSum(liste, toplam);
         System.out.println(toplam);

     }

    private static int getSum(List<String> liste, int toplam) {
        for (int i = 0; i < liste.size(); i++) {

            toplam += Integer.parseInt(liste.get(i).substring(1));

        }
        if (toplam<0){
            toplam=-1;
        }
         return toplam;
    }


}
