package keerthi;

public class Pattern {

	public static void main(String[] args) {
		for(int i=0;i<9;i++) {
			for(int j=0;j<=4;j++) {
				if(j==0||i==0||i==4||i==8||j==4)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
