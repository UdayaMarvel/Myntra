package liquidsystem;

import Watertank.watersupply.Watertank;

public class watersystem {

	public class Watertank {
		int a= 2000;

		public void mainTank() {
		 a= 5000;
		int a= 10;	
		System.out.println("Tank one=>" + this.a);
		}

		public void districtTank() {
		int a= 100;	 
		System.out.println("Tank Two=>" + a);

		}
		public  void corporationTank() {

			int a= 1000;
		System.out.println("Tank Three=>" + this.a);
		}

		public void villageTank() {
			
		System.out.println("Tank Foru=>" +a);
			
		}
		public void main(String[] args) {
			
			Watertank s = new Watertank();
			
			s.mainTank();
			s.districtTank();
			s.corporationTank();
			s.villageTank();
			System.out.println(a);
			System.out.println(Hi);
		}
	}
}

