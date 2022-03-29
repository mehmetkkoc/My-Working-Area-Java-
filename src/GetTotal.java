import java.util.Scanner;

public class GetTotal {
    /*
     3 tane pozitif String verildiğinde
     sayısal olmayan tüm karakterleri kaldırın.
     Stringleri int e çevirin
     ve total print edin

         Ornek:
        String num1 = "$15";
        String num2 = "$20";
        String num3 = "$30";
        output ----> 65; olmali

        NOT : Eğer output 0 dan küçük ise outputu -1 e cevir
  */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String allElements = scanner.nextLine();

        String[] elements = allElements.split(" ");

        String num1 = elements[0];

        String num2 = elements[1];

        String num3 = elements[2];
        num1=num1.replaceAll("\\D","");
        num2=num2.replaceAll("\\D","");
        num3=num3.replaceAll("\\D","");
        int num4 = Integer.parseInt(num1);
        int num5 = Integer.parseInt(num2);
        int num6 = Integer.parseInt(num3);
        int toplam=num4+num5+num6;
        System.out.println(toplam);










    }}
