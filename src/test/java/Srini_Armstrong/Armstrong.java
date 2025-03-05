package Srini_Armstrong;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=s.nextInt();
		int digits=0;
		int temp=0;
		int sum=0;
		
		temp=n;
		while(temp>0) {
			temp=temp/10;
			digits++;
		}
		System.out.println("Given number of digit is " + digits +".");
		
		temp=n;
		while(temp>0) {
			int lastDigit = temp%10;
			sum = (int) (sum + Math.pow(lastDigit, digits));
			temp = temp/10;
		}
		
		if(n==sum) {
			System.out.println("Given number is a armstrong number.");
		}
		else {
			System.out.println("Given number is not a armstrong number.");
		}
		s.close();
	}
}
