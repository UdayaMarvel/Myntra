package mint;

public class Mintt {
	public static void main(String[] args) {
	String s="suresh kumar raina suresh";
	int count=0;
	int count1=0;
	int count2=0;
	String h="";
	String[] split=s.split(" ");
	for(int i=0;i<split.length;i++) {
		String  g =split[i];
	if(g.equals("kumar")) {
		count=count+1;
		
	}
	else if(g.equals("suresh")) {
		count1=count1+1;
		
	}
	else if(g.equals("raina")){
		
		count2=count2+1;
		
	}
}
	System.out.println("kumar"+count);
	System.out.println("raina"+count2);
	System.out.println("sureah"+count1);
		System.out.println("suresh123");
}
}
