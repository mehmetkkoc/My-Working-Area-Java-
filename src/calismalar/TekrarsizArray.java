package calismalar;

import java.util.ArrayList;
import java.util.List;

public class TekrarsizArray {
    public static void main(String[] args) {

        int arr [] = {1,2,2,3,1,4,2,-2,5,6,8,7,5,6,-2,9,3,10};

        List<Integer> arrList=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {

            if (!arrList.contains(arr[i])){
                arrList.add(arr[i]);
            }

        }
        System.out.println(arrList);
    }
}
