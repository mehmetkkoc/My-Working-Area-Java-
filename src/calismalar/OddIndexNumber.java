package calismalar;

public class OddIndexNumber {
    public static void main(String[] args) {

        String metin="Mehmet";

        for (int i = 1; i <metin.length(); i+=2) {
            System.out.print(metin.charAt(i)+" ");
        }
    }
}
