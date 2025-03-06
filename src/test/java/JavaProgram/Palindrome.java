package JavaProgram;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner admin = new Scanner (System.in);
		System.out.print("Enter the name: ");
	       String name = admin.nextLine();
	       String rev1 = "";
	       for(int i=name.length()-1; i>=0; i--) {
	    	  char letters = name.charAt(i);
	    	   rev1=rev1+letters;
	       }
	       System.out.println("Name of the person: "+name);
	       System.out.println("rev of the name: "+rev1);
	       if (name.equalsIgnoreCase(rev1)) {
	    	   System.out.println("It is the palindrome: "+name);
	       } else {
	    	   System.out.println("It is not a palindrome: "+name);
	       }
	       }
}
	
