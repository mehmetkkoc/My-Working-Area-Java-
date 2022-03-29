import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exam1 {
    public static void main(String[] args) {
        /*
         * Kullanicidan gelen cumleyi  parametre olarak alan
         * ve cumledeki en uzun kelimeyi return eden LongestWord(sentence) methodu create ediniz.
         * Trick: Aynı uzunlukta iki veya daha fazla kelime varsa, String'deki en uzun ilk sözcüğü return edilsin
         * Noktalama işaretlerini dikkate almayın ve cumlenin boş olmayacağını varsayın.
         */
        Scanner scan = new Scanner(System.in);
        String cumle = scan.nextLine();
        String arr[] = cumle.split(" ");
        List<String> list = new ArrayList<String>();
        String uzun = "";
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);

        }
        for (int i = 0; i < list.size(); i++) {

            if (list.get(i).length()>uzun.length()) {
                uzun=list.get(i);
            }
        }
        System.out.println(list);
        System.out.println(uzun);


    }
}
