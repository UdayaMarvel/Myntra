package Test;


import java.util.Scanner;

public class Car {
	
	String make;
    String model;
    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    
        public void displayCarDetails() {
        System.out.println("Car Make " + make);
        System.out.println("Car Model " + model);
    }



    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Corolla");
        myCar.displayCarDetails();
    }
   
	
	}


