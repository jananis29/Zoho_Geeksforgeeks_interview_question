package set4;

import java.util.Scanner;

public class Factors {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		int k=0;
		int count[] = new int[n];
		for(int i=0;i<n;i++) {
			for(int j=1;j<=a[i];j++) {
				if(a[i]% j == 0) {
					k++;
				}
			}
			count[i]= k;
			System.out.print(count[i]+" ");
			k=0;
		}
		System.out.println();
		int temp=0;
		 for(int i=0;i<n;i++) {
			 for(int j=i+1;j<n;j++) {
				 if(count[i]< count [j]) {
					 temp = count[i];
					 count[i] = count[j];
					 count[j] = temp;
					 temp = 0;
					 temp = a[i];
					 a[i] = a[j];
					 a[j] = temp;
				 }
			 }
			 System.out.print(a[i] +" ");
		 }
		
	}

}
