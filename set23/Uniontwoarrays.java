package set23;

import java.util.Scanner;

public class Uniontwoarrays {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = sc.nextInt();
		int a[]= new int[n];
		
		for(int i=0;i<n;i++) {
			a[i]= sc.nextInt();
		}
		int m = sc.nextInt();
		int b[]= new int[m];
		for(int i=0;i<m;i++) {
			b[i]= sc.nextInt();
		}
	union(a,b,n,m);
		

	}

	private static void union(int[] a, int[] b, int n, int m) {
		// TODO Auto-generated method stub
	
		System.out.println("\nUnion:");
		  for(int i = 0; i<n; i++ ) {
		         for(int j = 0; j<m; j++) {
		        	 if(a[i] == b[j]) {
		        		 b[j] =-1;
		        	 } 
		         }
		  }
		  for(int i=0;(i<n);i++) 
				  System.out.print(a[i]+" ");
		
		  for(int j=0;j<m;j++) {
			  if(b[j]!= -1) {
				  System.out.print(b[j]+" ");
			  }
		  }
	}



}
