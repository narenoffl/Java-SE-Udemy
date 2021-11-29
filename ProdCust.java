class Product {

    // Private Variable Declaration - Data Hiding

    private String itemNo;
    private String name;
    private double price;
    private short qty;

    // Constructor

    public Product(String itemno) {
        itemNo = itemno;
    }

    public Product(String itemno, String name) {
        itemNo = itemno;
        this.name = name;
    }

    public Product(String itemno, String name, double price, short qty) {
        itemNo = itemno;
        this.name = name;
        setPrice(price);
        setQuantity(qty);
    }

    // Getter-Setter

    public String getItemNo() {
        return itemNo;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public short getQuantity() {
        return qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(short qty) {
        this.qty = qty;
    }
}

// Customer class

class Customer {
    // Private Variable Declaration - Data Hiding

    private String custId;
    private String name;
    private String address;
    private String phno;

    // Constructor

    public Customer(String custId, String name) {
        this.custId = custId;
        this.address = name;
    }

    public Customer(String custId, String name, String address, String phno) {
        this.custId = custId;
        this.address = name;
        setAddress(address);
        setPhno(phno);
    }

    // Getter-Setter

    public String getCustId() {
        return custId;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhno() {
        return phno;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhno(String phno) {
        this.phno = phno;
    }
}

// Main class

public class ProdCust {
    public static void main(String[] args) {

    }
}