package calismalar;

import java.util.Arrays;
import java.util.List;

public class Calisma {

    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(3,5,7,2,4,6,8);

        //list.forEach(x-> System.out.println(x));
       /* list.forEach(x->{
        x+=2;
            System.out.print(x+" ");

        });*/

       /* list.forEach(x->{
            int sayi=5;
            x*=sayi;
            System.out.println(x+"ve"+sayi);
        });*/

        /*
        int sayi2=2;
        list.forEach(x->{
            x+=sayi2;
            System.out.println("x= "+x);
        });*/
        list.forEach(System.out::println);
    }

}
