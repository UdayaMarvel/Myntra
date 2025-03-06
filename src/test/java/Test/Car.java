package Test;


import java.util.Scanner;

public class Car {
	int year =2025;
	String make;
    String model;
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year=year;
    }

    
        public void displayCarDetails() {
        System.out.println("Car Make " + make);
        System.out.println("Car Model " + model);
        System.out.println("Manufacturing year" + year);
    }



    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Corolla",id);
        myCar.displayCarDetails();
    }
   
	
	}


