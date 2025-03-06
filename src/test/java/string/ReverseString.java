package string;

public class ReverseString {
	public static void main(String[] agrs) {
		String Name = "Sivaranjan";
		String revstring = "";
		
		for(int i=Name.length()-1 ; i >= 0 ; i--) {
			revstring += Name.charAt(i);
		}
	   System.out.println("Reversed String:"+revstring);
	   System.out.println(Name);
	}

}
