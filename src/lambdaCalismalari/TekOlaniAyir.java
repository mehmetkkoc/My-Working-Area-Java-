package lambdaCalismalari;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TekOlaniAyir {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>(Arrays.asList(2,3,5,4,7,6));
        List<Integer> list2=new ArrayList<>();
        System.out.println(tekOlaniAyirma(list, list2));
    }
    public static List tekOlaniAyirma(List<Integer> list,List<Integer> list2){
       return list2=list.stream().filter(t->t%2==0).collect(Collectors.toList());

    }
}
