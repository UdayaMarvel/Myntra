package winterclothing;

public class Jackets extends Scarfs {





		
		public Jackets() {
			this(35.5f , 500);
			System.out.println("The total quantity of jackets are 1500");
			
		}

		public Jackets ( float f , int i) {
			this("wincloth");
		 System.out.println ("It can withstand upto minus "  + f +'\n' + "Pre-ordered quantities  " + i);
		}
		
		 public Jackets ( String s ) {
			 this(8113456l);
			 System.out.println("The name of the brand is " + s);
			 
		 }
		 
		 
		 
		 
			public Jackets (long l) {
				super();
				System.out.println("Product code Number is " + l);
			}
		
		
		public static void main ( String[] args)
		{
			Jackets jk = new Jackets();
		}
		
		
		
		
		
		
		

	}

	
	


