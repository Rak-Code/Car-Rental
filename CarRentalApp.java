import java.util.Scanner;

public class CarRentalApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RentalService rentalService = new RentalService();

        while (true) {
            System.out.println("\nWelcome to Car Rental System!");
            System.out.println("1. Add a Car");
            System.out.println("2. View Available Cars");
            System.out.println("3. Rent a Car");
            System.out.println("4. Return a Car");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Car ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Model: ");
                    String model = scanner.nextLine();
                    System.out.print("Enter Type: ");
                    String type = scanner.nextLine();
                    System.out.print("Enter Registration Number: ");
                    String regNumber = scanner.nextLine();
                    System.out.print("Enter Rental Price: ");
                    double price = scanner.nextDouble();
                    rentalService.addCar(new Car(id, model, type, regNumber, price));
                    break;

                case 2:
                    rentalService.viewAvailableCars();
                    break;

                case 3:
                    System.out.print("Enter Car ID to Rent: ");
                    int rentId = scanner.nextInt();
                    rentalService.rentCar(rentId);
                    break;

                case 4:
                    System.out.print("Enter Car ID to Return: ");
                    int returnId = scanner.nextInt();
                    rentalService.returnCar(returnId);
                    break;

                case 5:
                    System.out.println("Exiting Car Rental System. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
