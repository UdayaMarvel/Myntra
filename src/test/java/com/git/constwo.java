package com.git;


	public class constwo extends consone {

		public constwo () {
			this (645);
			System.out.println("Default const");
		}
		public constwo (int id) {
			this ("praveen");
			System.out.println("Argument const"+ id);
	}
		public constwo (String name) {
			super(545);
			System.out.println("String const" + name);
	}
		public constwo (float f) {
			System.out.println("float const"+ f);
	}
	    public static void main ( String [] args) {
	    	constwo c = new constwo();
	    	constwo c1 = new constwo(645);
	    	constwo c2 = new constwo("praveen");
	    	constwo c3 = new constwo(23.23f);
	    	
	    }
	}

