package interveiw;

import java.util.Arrays;
import java.util.Scanner;

public class Q01_CountsOfCharacters {
    public static void main(String[] args) {

        /*
     Kullanicidan bir String aliniz.
     String'de var olan her character'in sayisini ekrana yazdiriniz.
     Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
            abaa   ==> a=3  b=1
    */
        Scanner scan = new Scanner(System.in);
        System.out.println("kelime giriniz");
        String str = scan.next();

        int count = 0;

        String arr[]=str.split("");
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        for (int i = 1; i <arr.length ; i++) {
            if (arr[i-1].equalsIgnoreCase(arr[i])){
                count++;

            }else {
                System.out.println(arr[i-1]+" "+(count+1)+" ad var");
                count = 0;

            }
            if (i==arr.length-1){

                System.out.println(arr[i]+" "+(count+1)+" ad var");
            }
        }

        }
}
