package com.test;

public class GitTest {
	
	 public static void main(String[] args) {
		 
	        int age = 20;  // Change the age to test

	        // 1. Simple 'if' statement
	        if (age >= 18) {
	        	
	        System.out.println("Adult");
	        System.out.println("adult 2");
	        
	        System.out.println("adult 3");
	        
	        
	        System.out.println("adult 4");
	        
	        
	        System.out.println("adult 5");
	        
	        
	        }
	        // 2. 'if-else' statement
	        if (age >= 65) { 
	        	
	        	System.out.println("Senior");
	        
	        }
	        else {
	        	System.out.println("Not Senior");
	        }

	        // 3. Nested 'if'
	        if (age >= 18) {
	            if (age >= 21) {
	            	System.out.println("Eligible to drive");
	            }
	            else {
	            	System.out.println("Not eligible to drive"); 
	            }
	        }

	        // 4. 'if-else' with multiple conditions
	        if (age < 13) {
	        	System.out.println("Child");
	        }
	        else if (age <= 19) {
	        	
	       System.out.println("Teen");
	        }
	        else {
	        	System.out.println("Adult");
	        }
	    }
}


