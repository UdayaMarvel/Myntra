package JavaProgram;

public class SecondHighest {
	public static void main(String[] args) {
		int a[]= {10,11,97,1,12,96};  //1 10 11 12 96 97
		int b;
		for(int i=0; i < a.length; i++) { // i = 6 i < 6
			for(int j=i; j < a.length; j++) { // j = 6 j < 6
				if(a[i] > a[j]) { //10 > 11 
					b = a[i];
					a[i] = a[j];
					a[j] = b;
				}
			}
			System.out.println("Ascending order is : "+a[i]);
		}
		System.out.println();
		System.out.println("Second Highest value is: "+a[a.length-2]);
	}
	}
	
