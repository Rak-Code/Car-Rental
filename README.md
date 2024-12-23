# Car Rental Management System

## Overview

The Car Rental Management System is a console-based Java application designed to manage a fleet of rental cars. The system allows users to perform essential operations such as adding cars, viewing available cars, renting cars, and returning cars. This project is an excellent example of Object-Oriented Programming (OOP) concepts in action.

---

## Features

### Basic Features

1. **Add Cars**

   - Add a new car to the inventory by providing details such as ID, model, type, registration number, and rental price.

2. **View Available Cars**

   - Display a list of cars currently available for rent.

3. **Rent a Car**

   - Mark a car as rented based on its unique ID, updating its availability status.

4. **Return a Car**

   - Mark a rented car as available again based on its unique ID.

### Advanced Features (Optional Enhancements)

- Track customer details and rental history.
- Search for cars by type, price range, or other attributes.
- Persist car inventory and rental history using file handling.

---

## Project Structure

The project is divided into three main classes, each in its own file:

```
CarRentalProject/
├── Car.java
├── RentalService.java
├── CarRentalApp.java
```

### Class Details

1. **Car.java**

   - Represents a single car with attributes like ID, model, type, registration number, rental price, and availability.

2. **RentalService.java**

   - Handles operations like adding cars, viewing available cars, renting cars, and returning cars. It maintains the car inventory.

3. **CarRentalApp.java**

   - Provides a user-friendly menu-driven interface for interacting with the system.

---

## How to Run the Project

### Prerequisites

- Java Development Kit (JDK) installed on your machine.

### Steps to Run

1. Clone the repository or download the project files.
2. Navigate to the project directory:
   ```bash
   cd CarRentalProject
   ```
3. Compile all Java files:
   ```bash
   javac Car.java RentalService.java CarRentalApp.java
   ```
4. Run the main application:
   ```bash
   java CarRentalApp
   ```

---

## Sample Output

### Main Menu

```
Welcome to Car Rental System!
1. Add a Car
2. View Available Cars
3. Rent a Car
4. Return a Car
5. Exit
Enter your choice:
```

### Adding a Car

```
Enter Car ID: 101
Enter Model: Toyota Corolla
Enter Type: Sedan
Enter Registration Number: ABC123
Enter Rental Price: 40
Car added successfully!
```

### Viewing Available Cars

```
Available Cars:
ID: 101, Model: Toyota Corolla, Type: Sedan, Registration: ABC123, Price: $40/day, Available: true
```

### Renting a Car

```
Enter Car ID to Rent: 101
Car rented successfully!
```

### Returning a Car

```
Enter Car ID to Return: 101
Car returned successfully!
```

---

## Concepts Used

1. **Object-Oriented Programming (OOP):**

   - Encapsulation: Managing car details within the `Car` class.
   - Abstraction: Hiding the implementation details in `RentalService`.

2. **Collections Framework:**

   - `ArrayList` for managing car inventory.

3. **Exception Handling:**

   - Ensuring robust error handling for invalid inputs or operations.

4. **Java I/O (Optional):**

   - File handling for data persistence.

---

## Future Enhancements

- Add customer management to track rental history.
- Implement search and filter functionality.
- Integrate file handling for saving and loading car inventory.
- Develop a graphical user interface (GUI) for better user experience.

---

## License

This project is licensed under the MIT License. You are free to use, modify, and distribute it as per the license terms.

---

## Author

Rakesh Gupta...










