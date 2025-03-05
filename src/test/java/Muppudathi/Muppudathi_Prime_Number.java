package Muppudathi;

import java.util.Scanner;

public class Muppudathi_Prime_Number {
public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=s.nextInt();
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
			count++;
			}
		}
		
		if(count==2) {
			System.out.println("Given number is a prime number.");
		}
		else {
			System.out.println("Given number is not a prime number.");
		}
		
		
		//1 to 100 prime number printing
		System.out.println("Enter the number : ");
		int a=s.nextInt();
		System.out.println("1 to 100 Prime number is :-");
		for(int i=1;i<=a;i++) {
			int count1=0;
			for(int j=1;j<=a;j++) {
				if(i%j==0) {
					count1++;
				}
			}
			if(count1==2) {
				System.out.print(i + " ");
			}
		}
		
		
		s.close();
	
	}

}
