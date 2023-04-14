package set13;

import java.util.Scanner;

public class SpiralPrinting {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		int  len = 2*n-1;
		int min1, min2,min;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				min1 = i<=n-i?i-1:n-i;
				min2 = j<=n-j?j-1:n-j;
				min = min1<=min2? min1:min2;
				System.out.print(n-min+" ");
				
			}
			System.out.println();
		}

	}

}
