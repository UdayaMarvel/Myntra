package Swathi_Project;

import java.util.Scanner;

public class Swathi_String_Palindrome {

public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = s.nextLine();
		str = str.toLowerCase();
		char ch[] = str.toCharArray();
		String rev = "";
		
		for(int i=(ch.length-1);i>=0;i--) {
			rev = rev + ch[i]; 
		}
		
		System.out.println("Entered string is " + str +".");
		System.out.println("Reversed string is " + rev +".");
		if(str.equals(rev)) {
			System.out.println("Given string is a palindrome.");
		}
		else {
			System.out.println("Given string is not a palindrome.");
		}
		
		s.close();
	}
}
