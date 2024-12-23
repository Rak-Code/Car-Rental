public class Car {
    private final int id;
    private final String model;
    private final String type;
    private final String registrationNumber;
    private final double rentalPrice;
    private boolean isAvailable;

    public Car(int id, String model, String type, String registrationNumber, double rentalPrice) {
        this.id = id;
        this.model = model;
        this.type = type;
        this.registrationNumber = registrationNumber;
        this.rentalPrice = rentalPrice;
        this.isAvailable = true;
    }

    public int getId() {
        return id;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void rent() {
        this.isAvailable = false;
    }

    public void returnCar() {
        this.isAvailable = true;
    }

    public void displayDetails() {
        System.out.println("ID: " + id + ", Model: " + model + ", Type: " + type 
            + ", Registration: " + registrationNumber + ", Price: $" + rentalPrice + "/day, Available: " + isAvailable);
    }
}
