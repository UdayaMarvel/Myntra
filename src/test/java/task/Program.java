package task;


import java.util.*;

public class Program {
	public static void main(String[] args) {
		Map<Integer,String> a=new LinkedHashMap<>();
		Map<Integer,String> b=new LinkedHashMap<>();
		a.put(1,"rajesh");
		a.put(2,"suresh");
		a.put(3,"ramesh");
		a.put(4,"praveen");
		a.put(5,"ragu");
		a.put(6,"roshan");
		System.out.println(a);
		a.remove(2,"suresh");
		System.out.println(a);
		System.out.println(a.keySet());
		System.out.println(a.values());
		b.putAll(a);
		System.out.println(b);

		Set<Integer>i=a.keySet();
		for(Integer x:i)
		{
			System.out.println(x);
		}

	}


}

