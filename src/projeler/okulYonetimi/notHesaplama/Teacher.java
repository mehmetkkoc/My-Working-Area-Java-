package projeler.okulYonetimi.notHesaplama;

public class Teacher {
    private String nameTch;
    private String branch;

    public Teacher() {
    }

    public Teacher(String nameTch, String branch) {
        this.nameTch = nameTch;
        this.branch = branch;
    }

    public static void teacher(){

    }

    public String getNameTch() {
        return nameTch;
    }

    public void setNameTch(String nameTch) {
        this.nameTch = nameTch;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "nameTch='" + nameTch + '\'' +
                ", branch='" + branch + '\'' +
                '}';
    }
}

