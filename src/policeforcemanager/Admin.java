package policeforcemanager;
/**
 *
 * @author Aditya
 */

// menggunakan konsep Encapsulation dengan mendeklarasikan variabel private dan memberikan akses melalui metode login
class Admin {
    private String username;
    private String password;

    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean login(String inputUsername, String inputPassword) {
        return username.equals(inputUsername) && password.equals(inputPassword);
    }
}
