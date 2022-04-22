package calismalar;

public class Calisma {
    String name;
    int age;
    String phone;

    Calisma() {

    }

    Calisma(String name, int age,String phone) {
        this.name = name;
        this.phone = phone;
    }

    public static void main(String[] args) {

        Calisma c1=new Calisma();
        Calisma c2 = new Calisma("john", 25,"0536987843652");

        System.out.println(c2.name +", "+ c2.age+", "+c2.phone);
    }

}
