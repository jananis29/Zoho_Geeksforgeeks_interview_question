package set26;

import java.util.Scanner;

public class PrintFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		int max = a[0];
		for(int i=0;i<n;i++) {
			if(max <a[i]) {
				max = a[i];
			}
		}
		fibanocci(a, n, max);
	}

	private static void fibanocci(int[] a, int n, int max) {
		int n1=0,n2=1,n3,i;   
		    
		 for(i=2;i<=max;++i)  {    
			 n3=n1+n2;    
			 print(a,n3);
			 n1=n2;    
			 n2=n3;    
		 }    
		  
		
	}

	private static void print(int[] a, int n3) {
		// TODO Auto-generated method stub
		for(int i=0;i<a.length;i++) {
			if(a[i] == n3) {
				System.out.print(a[i] +" ");
			}
		}
	}

}
