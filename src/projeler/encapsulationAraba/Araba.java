package projeler.encapsulationAraba;

public class Araba {
    private String model="Deger Girilmemis";
    private String renk="Deger Girilmemis";
    private  int motor;
    private  int yil;

    public Araba(){

    }
    public Araba(String model, int yil){
        this.model = model;
        this.yil = yil;
    }
    public Araba(String model, String renk, int motor, int yil) {
        this.model = model;
        this.renk = renk;
        //this.motor = motor;
        setMotor(motor);
        this.yil = yil;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getMotor() {

        return motor;

    }

    public void setMotor(int motor) {
        if (motor<1000){
            System.out.println("Motor hacmi 1000 CC ve ustu olmali");

        }
        this.motor = motor;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        this.yil = yil;
    }

    @Override
    public String toString() {
        return "Araba{" +
                "model='" + model + '\'' +
                ", renk='" + renk + '\'' +
                ", motor=" + motor +
                ", yil=" + yil +
                '}';
    }
}
