package set18;

import java.util.Scanner;

public class CombinationofSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		int val = sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if((a[i]+a[j]) == val) {
					System.out.println(a[i] +" "+ a[j]);
				}
			}
			if(a[i] == val) {
				System.out.println(a[i]);
			}
		}
		

	}

}
