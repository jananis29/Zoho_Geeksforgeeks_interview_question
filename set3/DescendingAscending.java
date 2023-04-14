package set3;

import java.util.Scanner;

public class DescendingAscending {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[]= new int[n];
		for(int i=0;i<n;i++) {
			a[i]= sc.nextInt();
		
		}
		for(int i=0;i<n;i=i+2) {
			for(int j=i+2;j<n;j=j+2) {
				if(a[j]>a[i]) {
					a[i]= (a[i]+a[j])-(a[j]=a[i]);
				}
			}
		}
		for(int i=1;i<n;i=i+2) {
			for(int j=i+2;j<n;j=j+2) {
				if(a[j]<a[i]) {
					a[i]= (a[i]+a[j])-(a[j]=a[i]);
				}
			}
		}
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
		
	}
}
