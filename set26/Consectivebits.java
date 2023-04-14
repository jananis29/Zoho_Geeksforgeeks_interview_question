package set26;

import java.util.Scanner;

public class Consectivebits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		for(int i=0;i<n-1;) {
			if(a[i] == 1 && a[i+1] == 1) {
				System.out.print(a[i]+" ");
				System.out.print(a[i+1]+" ");
				System.out.print("0 ");
				i= i+2;
			}
			else {
				System.out.print(a[i]+" ");
				i++;
			}
			
		}
	}

}
