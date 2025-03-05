package Test;

import java.util.Iterator;
import java.util.Scanner;

public class JavaParogram {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		     
		System.out.println("Enter the string");
		     String m = s.nextLine();
		for (int i=m.length()-1;i>=0;i--) {
			char c = m.charAt(i);
			System.out.print(c);
			
			
		}

	}

}
