package calismalar;

import java.util.Scanner;

public class TwoString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. kelime");
        String kelime1=scanner.next();
        System.out.println("2. kelime");
        String kelime2=scanner.next();

        if (kelime1.substring(kelime1.length()-1).equals(kelime2.substring(0,1))){
            System.out.println(kelime1+kelime2.substring(1));
        }else{
            System.out.println(kelime1+kelime2);
        }
    }
}
