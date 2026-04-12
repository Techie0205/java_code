class Car {
    String make;
    String model;
    int year;

    // Method to display car details
    void displayDetails() {
        System.out.println("Car Details:");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}
//Step4: Define main fucntion to create object of Car class and call display method
public class ClassesandObjectdemo {
    public static void main(String[] args) {
        Car myCar = new Car(); // Creating an object of the Car class
        myCar.make = "Toyota";
        myCar.model = "Corolla";
        myCar.year = 2020;

        myCar.displayDetails(); // Calling the method to display car details
    }
}