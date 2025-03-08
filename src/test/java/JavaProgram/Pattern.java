package JavaProgram;

import java.util.Scanner;

public class Pattern {
	public static void main(String[] args) {
		Scanner admin = new Scanner(System.in);
		int num = admin.nextInt();
		int b = 1;
		for(int i=1; i<=num; i++) {
		   b=b*i;
		}
		System.out.println(b);
			

	}
	}
	
