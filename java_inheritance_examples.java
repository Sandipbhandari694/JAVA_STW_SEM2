// 1. Vehicle and Car
class Vehicle {
    void drive() {
        System.out.println("Driving a vehicle");
    }
}

class Car extends Vehicle {
    void display() {
        System.out.println("This is a car");
    }
}

// 2. Employee and HRManager
class Employee {
    void work() {
        System.out.println("Employee is working");
    }
    double getSalary() {
        return 30000.0;
    }
}

class HRManager extends Employee {
    @Override
    void work() {
        System.out.println("HR Manager is managing employees");
    }
}

// 3. Geometry Calculator with Multilevel Inheritance
class Shape {
    double radius;
    Shape(double radius) {
        this.radius = radius;
    }
}

class Rectangle extends Shape {
    double length, breadth;
    Rectangle(double length, double breadth) {
        super(0);
        this.length = length;
        this.breadth = breadth;
    }
    double calculateArea() {
        return length * breadth;
    }
}

class Circle extends Shape {
    Circle(double radius) {
        super(radius);
    }
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// 4. Hierarchical Inheritance for Vehicles
class BaseVehicle {
    void startEngine() {
        System.out.println("Engine started");
    }
    void stopEngine() {
        System.out.println("Engine stopped");
    }
}

class CarVehicle extends BaseVehicle {
    void drive() {
        System.out.println("Car is driving");
    }
}

class Motorcycle extends BaseVehicle {
    void ride() {
        System.out.println("Motorcycle is riding");
    }
}

// 5. Shape with Area, Perimeter, and Circumference
class ShapeBase {
    double calculateArea() {
        return 0.0;
    }
}

class RectangleShape extends ShapeBase {
    double length, breadth;
    RectangleShape(double l, double b) {
        this.length = l;
        this.breadth = b;
    }
    @Override
    double calculateArea() {
        return length * breadth;
    }
    double calculatePerimeter() {
        return 2 * (length + breadth);
    }
}

class CircleShape extends ShapeBase {
    double radius;
    CircleShape(double r) {
        this.radius = r;
    }
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
    double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
}

// 6. Book Hierarchy
class Book {
    String title, author;
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    void displayDetails() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

class FictionBook extends Book {
    FictionBook(String title, String author) {
        super(title, author);
    }
}

class NonFictionBook extends Book {
    NonFictionBook(String title, String author) {
        super(title, author);
    }
}

class TechnicalBook extends Book {
    TechnicalBook(String title, String author) {
        super(title, author);
    }
}

// Main class to test all examples
public class Main {
    public static void main(String[] args) {
        // Test 1
        Car car = new Car();
        car.drive();
        car.display();

        // Test 2
        HRManager hr = new HRManager();
        hr.work();
        System.out.println("Salary: " + hr.getSalary());

        // Test 3
        Rectangle rect = new Rectangle(5, 10);
        Circle circle = new Circle(7);
        System.out.println("Rectangle Area: " + rect.calculateArea());
        System.out.println("Circle Area: " + circle.calculateArea());

        // Test 4
        CarVehicle carV = new CarVehicle();
        carV.startEngine();
        carV.drive();
        carV.stopEngine();

        Motorcycle moto = new Motorcycle();
        moto.startEngine();
        moto.ride();
        moto.stopEngine();

        // Test 5
        RectangleShape rShape = new RectangleShape(4, 6);
        CircleShape cShape = new CircleShape(3);
        System.out.println("Rectangle Area: " + rShape.calculateArea());
        System.out.println("Rectangle Perimeter: " + rShape.calculatePerimeter());
        System.out.println("Circle Area: " + cShape.calculateArea());
        System.out.println("Circle Circumference: " + cShape.calculateCircumference());

        // Test 6
        FictionBook fb = new FictionBook("1984", "George Orwell");
        NonFictionBook nfb = new NonFictionBook("Sapiens", "Yuval Noah Harari");
        TechnicalBook tb = new TechnicalBook("Clean Code", "Robert C. Martin");
        fb.displayDetails();
        nfb.displayDetails();
        tb.displayDetails();
    }
}
