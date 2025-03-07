package project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Java {
	//Using public access specifier to access in different package
	public static Java test5 = null;
	
	//static method for calling method without creating the object
	public static Java getName() {
		if(test5==null) {
			test5 = new Java();
		}
		
		//returning the object value of the Project
		return test5;
	}
	
	//private constructor is used to restrict multiple object creation
	private Java() {}
	
	public static void main(String[] args) {
		//storing the method value in variable
		File f = new File("C:\\Users\\srira\\eclipse-workspace\\ExcelReadAndWrite\\src\\test\\resources\\NewFile.properties");
        try {
		FileInputStream f1 = new FileInputStream(f);
        Properties prop = new Properties();
           try {
        	   prop.load(f1);
           }
           catch(IOException e) {
        	   e.printStackTrace();
           }
           String name = prop.getProperty("name");
           System.out.println(name);
           String mailid = prop.getProperty("name");
           System.out.println(mailid);
           String dob = prop.getProperty("name");
           System.out.println(dob);
           String password = prop.getProperty("name");
           System.out.println(password);
           FileOutputStream f2 = new FileOutputStream(f);
           prop.setProperty("name", "Purushoth");
           prop.save(f2,"Updated the name");
        
        }
        catch(FileNotFoundException ex) {
        	ex.printStackTrace();
        }
		Java test1 = getName();
		//using sysout to print on the console
		//system.identityHashCode the memory of method
		System.out.println(System.identityHashCode(test1));
		Java test2 = getName();
		System.out.println(System.identityHashCode(test2));
		Java test3 = getName();
		System.out.println(System.identityHashCode(test3));
		Java test4 = getName();
		System.out.println(System.identityHashCode(test4));
	}

}
