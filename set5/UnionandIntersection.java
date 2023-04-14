package set5;

import java.util.Scanner;

public class UnionandIntersection {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
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
		intersection(a,b,n,m);
		except(a,b,n,m);
	}

	private static void except(int[] a, int[] b, int n, int m) {
		// TODO Auto-generated method stub
		
		System.out.println("\nExcept:");
		for(int i=0;i<n;i++) {
			if(a[i]%2 !=0)
			System.out.print(a[i]+" ");
		}
		for(int i=0;i<m;i++) {
			if(b[i]%2 ==0)
			System.out.print(b[i]+" ");
		}
		
	}

	private static void intersection(int[] a, int[] b, int n, int m) {
		// TODO Auto-generated method stub
		int i = 0, j = 0;
		System.out.println("\nIntersection:");
		while (i < n && j < m)
	    {
	            if (a[i] < b[j])
	            	i++;
	            else if(b[j]<a[i])
	            	j++;
	            else {
	            	System.out.print(b[j++]+" ");
	            	i++;
	            }
	    }
	}

	private static void union(int[] a, int[] b, int n, int m) {
		
			int i = 0, j = 0;
			System.out.println("\nUnion:");
			    while (i < n && j < m)
			    {
			            if (a[i] < b[j])
			                  System.out.print(a[i++]+" ");
			            else if (b[j] < a[i])
			                  System.out.print(b[j++]+" ");
			            else
			            {
			                  System.out.print(a[i++]+" ");
			                  j++;
			            }
			      }
			    while(i < n)
			    	System.out.print(a[i++]+" ");
			      while(j < m)
			    	  System.out.print(b[j++]+" ");
			}

}
