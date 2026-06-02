public class SmartParkingSystem {

    String vehicleNumber;
    int hoursParked;
    String vehicleType;
    int parkingFee;

    // Constructor
    SmartParkingSystem(String vn, int hp, String vt) {

        vehicleNumber = vn;
        hoursParked = hp;
        vehicleType = vt;

        // Calculate parking fee
        if (vehicleType == "Bike") {
            parkingFee = hoursParked * 10;
        }
        else if (vehicleType == "Car") {
            parkingFee = hoursParked * 30;
        }
        else if (vehicleType == "Bus") {
            parkingFee = hoursParked * 50;
        }
    }

    // Display method
    void display() {

        System.out.println("Vehicle Number : " + vehicleNumber);
        System.out.println("Hours Parked : " + hoursParked);
        System.out.println("Vehicle Type : " + vehicleType);
        System.out.println("Parking Fee : " + parkingFee);
    }

    public static void main(String[] args) {

        SmartParkingSystem s1 =
                new SmartParkingSystem("BR01AB1234", 5, "Car");

        s1.display();
    }
}
