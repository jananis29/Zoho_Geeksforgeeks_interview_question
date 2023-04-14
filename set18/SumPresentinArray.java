package set18;

import java.util.Scanner;

public class SumPresentinArray {

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
				if((i+j) == val) {
					System.out.print("True");
					val =0;
					break;
				}
			}
		}
		if(val != 0) {
			System.out.println("False");
		}

	}

}
