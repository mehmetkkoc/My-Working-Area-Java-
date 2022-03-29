import java.util.Scanner;

public class exam2 {

    /*
     * Kullanicidan gelen datayi methodda parametre olarak alan
     * ve datanın 2'nin kuvveti olup olmadığını kontrol eden PowersofTwo(num) methodu create ediniz.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int num = scanner.nextInt();
        boolean kuvvet = false;
        powerOfTwo(num, kuvvet);

    }

    public static boolean powerOfTwo(int num, boolean kuvvet) {

        for (int i = 1; i <= num ; i*=2) {

            if (i == num) {
                kuvvet = true;
                break;
            }
        }
        if(kuvvet){
            System.out.println("2 nin kuvvetidir");
        }else{
            System.out.println("2 nin kuvveti degildir");
        }


        return kuvvet;
    }
}
