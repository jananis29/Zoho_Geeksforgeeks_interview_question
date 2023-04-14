package set24;

import java.util.Scanner;

public class WaveFormation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i]  = sc.nextInt();
		}
		for(int i=0;i<n-1;i=i+2) {
			if(a[i] < a[i+1]) {
				a[i] = (a[i]+a[i+1])-(a[i+1]= a[i]);
			}
			System.out.print(a[i]+" "+a[i+1]+" ");
		}
		if(n%2 !=0) {
			System.out.print(a[n-1]);
		}
		

	}

}
