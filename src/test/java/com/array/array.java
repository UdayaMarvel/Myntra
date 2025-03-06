package com.array;

public class array {
	
		
		public static void main(String[] args) {
			
			int a[]= {1,6,3,4,5};
			int c;
			
			for(int i=0;i<=a.length;i++) {
				for(int j=i+1;j<a.length;j++) {
					if(a[i]>a[j]) {
						c=a[i];
						a[i]=a[j];
						a[j]=c;
						
					}
					
				}
				System.out.println("ascen" +a[i]);
			}
			System.out.println("min" +a[a.length-2]);
		}
	}


