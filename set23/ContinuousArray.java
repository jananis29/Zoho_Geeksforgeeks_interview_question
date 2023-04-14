package set23;

import java.util.Scanner;

public class ContinuousArray {


	public static void main(String[] args) {
		// TODO Auto-generated method stub\\
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(a[i]>a[j]) {
					a[i] = (a[i]+a[j]) - (a[j] = a[i]);
				}
			}	
		}
		int k=0,m=0;
		for(int i=0;i<n;) {
			k =range(a, i);
			
			for(int j=0;j<=k;j++) {
				System.out.print(a[i+j]+" ");
				m++;
			}
			System.out.println();
			i=m;
			
		}

	}

	private static int range(int[] a, int i2) {
		int count=0;
		int i=i2;
		while(i<a.length-1) {
			if(a[i] == a[i+1]-1) {
				count++;
			}
			else {
				break;
			}
			i++;
			
		}
		return count;
	}

}
