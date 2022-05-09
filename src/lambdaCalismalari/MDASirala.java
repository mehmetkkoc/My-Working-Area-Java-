package lambdaCalismalari;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MDASirala {
    public static void main(String[] args) {
        String isim[][] = {{"Ali", "Veli", "Ayse"}, {"Hasan", "Can"}, {"Suzan"}};
        mDA(isim);
    }
    public static void mDA(String isim[][]){
        List<String> list = new ArrayList<String>();
            for (int i = 0; i < isim.length ; i++) {
                for (int j = 0; j <isim[i].length ; j++) {

                    list.add(isim[i][j]);
            }
        }
        System.out.println(list);
            list.stream().sorted().forEach(System.out::println);
    }

}
