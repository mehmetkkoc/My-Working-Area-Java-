package lambdaCalismalari;

import java.util.Arrays;

public class TekrarsizArrays {
    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 1, 4, 2, 5, 6, 8, 7, 5, 9, 1};

        int arrTekrarsiz[]=Arrays.stream(arr).distinct().toArray();
        System.out.println(Arrays.toString(arrTekrarsiz));
    }
}
