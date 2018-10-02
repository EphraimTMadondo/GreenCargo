package greencargo.co.zw.greencargo.model;

public class User {
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    private String user;

    public User() {
    }

    public User(String user, String pass) {

        this.user = user;
        this.pass = pass;
    }

    private String pass;


}
