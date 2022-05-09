package lambdaCalismalari;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class KarelerinToplami {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(2,3,4,5,6,7,8,9,10));
        System.out.println(karelerinToplami(list));
    }
    public static int karelerinToplami(List<Integer> list) {
        return list.stream().mapToInt(t -> t * t).sum();


    }}


