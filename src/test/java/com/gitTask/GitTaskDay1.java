package com.gitTask;

import java.util.LinkedHashMap;
import java.util.Map;


public class GitTaskDay1 {
	
	public static void main(String[] args) {
		
		Map<String, Integer> a = new LinkedHashMap<String, Integer>();
		a.put("Oppo", 10000);
		a.put("vivo", 20000);
		a.put("oneplus", 30000);
		a.put("iphone", 50000);
		a.put("Samsung", 40000);
		a.put("Oppo", 15000);
	
		System.out.println(a);
		for (Map.Entry<String, Integer> entry : a.entrySet()) {
			System.out.println(entry);

		}
		
		Map<String, Integer> a1 = new LinkedHashMap<String, Integer>();
		a1.put("Pulsar", 90000);
		a1.put("Duke", 150000);
		a1.put("Dio", 75000);
		a1.put("Bullet", 120000);
		a1.putAll(a);
		System.out.println(a1);
		for (Map.Entry<String, Integer> entry1 : a1.entrySet()) {
			System.out.println(entry1);

			
		}
		if (a1.containsKey(a) && a1.containsValue(a)) {
			System.out.println("Contains");
			
		}else {
		    System.out.println("Contain more");
		}

	}

}
