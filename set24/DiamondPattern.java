package set24;

import java.util.Scanner;

public class DiamondPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k=2;
		int v =0;
		for(int i=1;i<=n;i++) {
			for(int s =0;s<=n-i;s++) {
				System.out.print(" ");
			}
			if(i==n) {
				v= k;
			}
			for(int j=0;j<i;j++) {
				System.out.print(--k+" ");
				
			}
			System.out.println();
			
			k = k+(2*i)+1;
		}
		k=v;
		for(int i=n-1;i>=0;i--) {
			for(int s =0;s<n-i;s++) {
				System.out.print("  ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print(--k+"  ");
				
			}
			System.out.println();
			
		}
		
	}

}
