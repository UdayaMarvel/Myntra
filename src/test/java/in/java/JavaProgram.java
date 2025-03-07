package in.java;

import java.util.LinkedHashMap;
import java.util.Map;

public class JavaProgram {

	public static void main(String[] args) {
		String s = "vishnu";
	    //<v,1>
	Map<Character,Integer> mp = new LinkedHashMap<>();
	for(int i=0; i<s.length(); i++) {
		char x = s.charAt(i);
		if(mp.containsKey(x)) {
			int a = mp.get(x);
			      //(i,2)
			mp.put(x, a+1);
		}else {   //(v,1) (i,1) (j,1) (a,1) (y,1)
			mp.put(x, 1);
		}
	}
	System.out.println(mp);

}
		

	}


