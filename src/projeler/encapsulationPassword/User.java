package projeler.encapsulationPassword;

public class User {
    private String id;
    private String userName;
    private String password;
    private boolean active = false;
    private boolean signedIn = true;


    public User() {
    }

    public User(String id, String userName, String password, boolean active, boolean signedIn) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.active = active;
        this.signedIn = signedIn;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isSignedIn() {
        return signedIn;
    }

    public void setSignedIn(boolean signedIn) {
        this.signedIn = signedIn;
    }


    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", active=" + active +
                ", signedIn=" + signedIn +
                '}';
    }
}
