package set6;

import java.util.Scanner;

public class RotatingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		int k =sc.nextInt();
		for(int i=0;i<k;i++) {
			int j,last;
			last = a[n-1];
			for(j = n-1;j>0;j--) {
				a[j] = a[j-1];
			}
			a[0] = last;
		}
		 System.out.println();       
	        System.out.println("Array after right rotation: ");    
	        for(int i = 0; i<n; i++){    
	            System.out.print(a[i] + " ");    
	        }    
	    }    
	

}
