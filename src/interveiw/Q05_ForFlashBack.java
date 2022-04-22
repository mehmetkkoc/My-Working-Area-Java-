package interveiw;

public class Q05_ForFlashBack {
    /*
     * Kullanicidan bir cumle ve bir harf alin,
     * Cumlede harfin kac kere
     * kullanildigini bulup, yazdirin
     *
     * ORNEK:
     *
     * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
     *
     * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
     */
    public static void main(String[] args) {

        String cumle="Java ogrEnmek cok guzel.";
        String harf="e";
        int count=0;

        for (int i = 0; i <cumle.length() ; i++) {

            if (cumle.toUpperCase().charAt(i)==harf.toUpperCase().charAt(0)) {
               count++;

            }

        }
        if (count!=0){
            System.out.println(harf+" "+count+" adet bulunmaktadir");
        }else{
            System.out.println("Cumle icerisinde "+harf+" bulunmamaktadir");
        }
    }
}
