package JavaProgram;

public class SecondHighest {
	public static void main(String[] args) {
		int a[]= {10,11,19,97,17,12,18,98};
		int b;
		for(int i=0; i<=a.length-1; i++) {
			for(int j=i; j<=a.length-1; j++) {
				if(a[i] >= a[j]) {
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
	
