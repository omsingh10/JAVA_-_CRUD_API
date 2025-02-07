package Shiv.demo.model;

public class Cloudvender {

    private String venderId;
    private String venderName;
    private String venderAdress;
    private String venderPhoneNumber;

    // Constructor to initialize all attributes
    public Cloudvender (String venderId, String venderName, String venderAdress, String venderPhoneNumber) {
        this.venderId = venderId;
        this.venderName = venderName;
        this.venderAdress = venderAdress;
        this.venderPhoneNumber = venderPhoneNumber;
    }

    // Getter methods (optional)
    public String getVenderId() {
        return venderId;
    }

    public String getVenderName() {
        return venderName;
    }

    public String getVenderAdress() {
        return venderAdress;
    }

    public String getVenderPhoneNumber() {
        return venderPhoneNumber;
    }

    // Setter methods (optional)
    public void setVenderId(String venderId) {
        this.venderId = venderId;
    }

    public void setVenderName(String venderName) {
        this.venderName = venderName;
    }

    public void setVenderAdress(String venderAdress) {
        this.venderAdress = venderAdress;
    }

    public void setVenderPhoneNumber(String venderPhoneNumber) {
        this.venderPhoneNumber = venderPhoneNumber;
    }
}

