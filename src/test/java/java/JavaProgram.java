package java;

import java.util.Scanner;

public class JavaProgram {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("What is your name? ");
		String name = scanner.nextLine();

		System.out.println("How old are you? ");
		int age = scanner.nextInt();
		scanner.nextLine();

		System.out.println("What is your favourte food? ");
		String food = scanner.nextLine();


		System.out.println("Hello "+name);
		System.out.println("You are "+age+" years old");
		System.out.println("favourite food "+food );

		scanner.close();
	}
}


