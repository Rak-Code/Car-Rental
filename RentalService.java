import java.util.ArrayList;
import java.util.List;

public class RentalService {
    private final List<Car> carInventory;

    public RentalService() {
        carInventory = new ArrayList<>();
    }

    public void addCar(Car car) {
        carInventory.add(car);
        System.out.println("Car added successfully!");
    }

    public void viewAvailableCars() {
        System.out.println("Available Cars:");
        for (Car car : carInventory) {
            if (car.isAvailable()) {
                car.displayDetails();
            }
        }
    }

    public void rentCar(int carId) {
        for (Car car : carInventory) {
            if (car.getId() == carId) {
                if (car.isAvailable()) {
                    car.rent();
                    System.out.println("Car rented successfully!");
                } else {
                    System.out.println("Car is not available for rent.");
                }
                return;
            }
        }
        System.out.println("Car with ID " + carId + " not found.");
    }

    public void returnCar(int carId) {
        for (Car car : carInventory) {
            if (car.getId() == carId) {
                if (!car.isAvailable()) {
                    car.returnCar();
                    System.out.println("Car returned successfully!");
                } else {
                    System.out.println("Car is already available.");
                }
                return;
            }
        }
        System.out.println("Car with ID " + carId + " not found.");
    }
}
