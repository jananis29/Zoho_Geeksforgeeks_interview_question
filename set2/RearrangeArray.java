package set2;

import java.util.Scanner;

public class RearrangeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a= new int[n];
		for(int i=0;i<n;i++) {
			a[i]= sc.nextInt();
		}
		int temp =0;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(a[i]> a[j]) {
					temp= a[i];
					a[i]= a[j];
					a[j]= temp;
				}
			}	
		}
		int min=0,max= n-1;
		for(int i=0;i<n/2;i++) {
			System.out.print(a[min++]+" ");
			System.out.print(a[max--]+" ");
			if(i==((n/2)-1)) {
				System.out.print(a[max]+" ");
			}
			
		}

	}

}
