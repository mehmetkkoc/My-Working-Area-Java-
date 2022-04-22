package projeler.encapsulationAraba;

public class ArabaMain {
    public static void main(String[] args) {


        Araba honda = new Araba();
        Araba fiat = new Araba("Egea", 2020);
        Araba ford = new Araba("Focus", "Mavi", 600, 2022);
        Araba bmw = new Araba("X3", "Sari", 2000, 2021);

        System.out.println(honda);
        System.out.println(fiat);
        System.out.println(ford);
        System.out.println(bmw);

    }
}
