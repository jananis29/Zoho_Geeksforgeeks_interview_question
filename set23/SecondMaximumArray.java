package set23;

import java.util.Scanner;

public class SecondMaximumArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		int temp=0;
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				if(a[i]>=a[j]) {
					temp =a[i];
					a[i]= a[j];
					a[j]= temp;
				}
			}
		
		}
		if(n>=2)
		System.out.print(a[n-2]+" ");
		else {
			System.out.print("no second max");
		}
	}
}
