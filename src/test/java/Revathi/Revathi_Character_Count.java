package Revathi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Revathi_Character_Count {
public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = s.nextLine();
		str = str.toLowerCase();
		char ch[] = str.toCharArray();
		
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		for(Character x : ch) {
			if(x!=' ') 
			{
				if(map.containsKey(x)) {
					Integer a = map.get(x);
					map.put(x, a+1);	
				}
				else {
					map.put(x,1);
				}
			}
		}
		System.out.println(map);
		
		for(char i='a';i<='z';i++) {
			int count = 0;
			for(int j=0;j<ch.length;j++) {
				if(ch[j]!=' ') 
				{
					if(ch[j]==i) {
						count++;
					}
				}
			}
			if(count>0)
			{
			System.out.println("Count of " + i + " is " + count + ".");
			}
		}
		
		s.close();
	}
}
