package com.myntra.men_stepdefinition;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class XmlReadWrite extends Data {

	public static void main(String[] args) throws JAXBException, FileNotFoundException {
		JAXBContext jb = (JAXBContext.newInstance(Data.class));
		Unmarshaller um = jb.createUnmarshaller();
		
		Data db1 = new Data();
		db1.setId("23");
		db1.setMail("udaya");
		db1.setPassword("null");
		db1.setUsername("marvel");
		db1.getId();
		db1.getMail();
		db1.getPassword();
		db1.getUsername();
		
		
		File f = new File("C:\\Users\\ADMIN\\eclipse-workspace\\Myntra.Cucumber\\src\\test\\resources\\Creds.xml");
		FileInputStream f1 = new FileInputStream(f);
		Data db = (Data) um.unmarshal(f1);
		System.out.println(db.getId()+db.getMail()+db.getPassword()+db.getUsername());
		
		FileOutputStream f2 = new FileOutputStream(f);
		Marshaller mar = jb.createMarshaller();
		mar.setProperty(mar.JAXB_FORMATTED_OUTPUT,true);
		mar.marshal(db1, f2);
		
	}
	
}
