package set23;

import java.util.Scanner;

public class ArraywithoutDuplicate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[]= new int[n];
		
		for(int i=0;i<n;i++) {
			a[i]= sc.nextInt();
		}
		int k=0;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(a[i] ==a[j]) {
					k++;
				}
			}
			if(k == 0) {
				System.out.println(a[i]);
			
			}  
			k=0;
		} 
	}
}
