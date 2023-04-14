package set3;

import java.util.Scanner;

public class Union {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int a[] = new int[m];
		for(int i=0;i<m;i++) {
			a[i] = sc.nextInt();
		}
		int n = sc.nextInt();
		int b[] = new int[n];
		for(int i=0;i<n;i++) {
			b[i] = sc.nextInt();
		}
		int val = m+n;
		int c[]= new int[val]; 
		
		merge(a,b,m,n,c);
		display(val,c);
	}

	public static void merge(int[] arr1, int[] arr2, int n1,int n2, int[] arr3) {
			  int i = 0, j = 0, k = 0;
			  while (i < n1 && j < n2) {
			    if (arr1[i] < arr2[j])
			      arr3[k++] = arr1[i++];
			    else
			      arr3[k++] = arr2[j++];
			  }
			  while (i < n1)
			    arr3[k++] = arr1[i++];
			 
			  while (j < n2)
			    arr3[k++] = arr2[j++];
			  
			}

	private static void display(int len, int[] a) {
		 int b=0;
	        a[b]=a[0];
	        for(int i=0;i<a.length;i++)
	        {
	            if (a[b]!=a[i])
	            {
	                b++;
	                a[b]=a[i];
	            }
	        }
	        for (int i=0;i<=b+1;i++)
	        {
	            System.out.print(a[i]+" ");
	        }
	}

	
}
