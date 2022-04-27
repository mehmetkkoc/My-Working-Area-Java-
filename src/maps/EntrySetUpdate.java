package maps;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class EntrySetUpdate {
    public static void main(String[] args) {

        Map<Integer,String> sinifListMap= MapOlustur.myMap();

        System.out.println(sinifListMap);

        Set<Map.Entry<Integer,String>> sinifEntrySet= sinifListMap.entrySet();

        Scanner scan=new Scanner(System.in);
        System.out.println("Bilgisini degistirmek istediginiz ogrenci no girin");
        int degisecekNo = scan.nextInt();

        for (Map.Entry<Integer,String> each: sinifEntrySet
        ) {
            Integer keyEntry=each.getKey();
            String valueEntry= each.getValue();
            String valueArr[]= valueEntry.split(", ");

            valueArr[2]="Java";
            String valueYeni= valueArr[0] + ", " + valueArr[1] + ", " + valueArr[2] + ", "
                    + valueArr[3];
            sinifListMap.put(keyEntry,valueYeni);
        }
        System.out.println(sinifListMap);
    }
}
