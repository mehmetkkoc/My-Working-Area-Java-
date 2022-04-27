package calismalar;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomListOlustur {
    public static void main(String[] args) {
        // int array list oluşturun 10 elemandan oluşmalı
        // random ekle isminde void bir metod oluşturun  ve parametresi int array list olsun.
        // bu metod array list içinde 0' dan 20 ye kadar değer atasın.
        // eğer çift sayı atarsa o elemanının yerine 111 yazsın
        // eğer çift sayı yoksa çift sayı yoktur mesajını versin.

        List<Integer> list = new ArrayList<>();
        randomElemanEkle(list);


    }

    private static void randomElemanEkle(List<Integer> list) {

        for (int i = 0; i < 10; i++) {

            list.add((int) (Math.random()*20));


        }
        int count=0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)%2==0){
                list.set(i,111);
                count=1;
            }

        }
        if (count==0) {
            System.out.println("cift sayi buunmamaktadir");
        }
        System.out.println(list);
    }
}
