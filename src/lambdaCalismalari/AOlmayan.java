package lambdaCalismalari;

import java.util.*;

public class AOlmayan {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList("Ali", "Veli", "Ayse", "Fatma", "Omer"));

        aOlmayan(list);

    }
    public static void aOlmayan(List<String> list){
        list.stream().filter(t->!t.toUpperCase().contains("A")).forEach(System.out::println);
    }


}