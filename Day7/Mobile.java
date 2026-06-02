

public class Mobile {

    String brand;
    private int price;
    int storage;

    // Constructor
    Mobile(String brand, int price, int storage) {
        this.brand = brand;
        this.price = price;
        this.storage = storage;
    }

    // Method to display details
    void displayDetails() {
        System.out.println("Brand : " + brand);
        System.out.println("Price : ₹" + price);
        System.out.println("Storage : " + storage + "GB");
        System.out.println("----------------------");
    }

    public static void main(String[] args) {

        // Creating 2 mobile objects
        Mobile m1 = new Mobile("Samsung", 25000, 128);
        Mobile m2 = new Mobile("iPhone", 80000, 256);

        // Displaying details
        m1.displayDetails();
        m2.displayDetails();
    }
}