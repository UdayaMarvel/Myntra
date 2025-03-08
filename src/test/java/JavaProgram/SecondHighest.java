package JavaProgram;

public class SecondHighest {
	public static void main(String[] args) {
		int a[]= {10,11,97,1,12,96};  //1 10 11 12 97 96
		int b;
		for(int i=0; i < a.length; i++) { // i = 6 6 < 6 false
			for(int j=i+1; j < a.length; j++) { // j = 6 6 < 6 false
				if(a[i] > a[j]) { //97 > 97 false
					b = a[i]; 
					a[i] = a[j]; 
					a[j] = b; 
				}
			}
			System.out.println("Ascending order is : "+a[i]); //1 10 11 12 96 97
		}
		System.out.println();
		System.out.println("Second Highest value is: "+a[a.length-2]);
	}
	}
	
