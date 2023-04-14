package set27;

import java.util.Scanner;

public class ExtraElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		int b[] = new int[m];
		for(int i=0;i<m;i++) {
			b[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(a[i] == b[j]) {
					a[i] =9999;
					b[j] = 9999;
				}
			}
		}
		for(int i=0;i<n;i++) {
			if(a[i]!=9999) {
				System.out.print(a[i] +" in array 1 at position "+ i);
			}
		}
		for(int i=0;i<m;i++) {
			if(b[i]!=9999) {
				System.out.print(b[i] +" in array 2 at position "+ i);
			}
		}
	}

}
