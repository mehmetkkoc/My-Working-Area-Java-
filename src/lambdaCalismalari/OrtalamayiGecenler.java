package lambdaCalismalari;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OrtalamayiGecenler {
    public static void main(String[] args) {


        List<Integer> list = new ArrayList<Integer>(Arrays.asList(70,80,90,95,85,75));

        ortalamayiGecen(list);

    }
    public static void ortalamayiGecen(List<Integer> list){
        double ortalama=list.stream().reduce(0,(u,t)->u+t)/list.size();
        list.stream().filter(t->t>ortalama).forEach(System.out::println);
    }
}
