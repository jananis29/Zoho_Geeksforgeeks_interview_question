package set8;

import java.util.Scanner;

public class SortAlternately {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[]= new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(a[i] > a[j]) {
					a[i] =(a[i]+a[j])-(a[j]=a[i]);
				}
			}
		}
		int odd =0, even =n-1;
		for(int i=0;i<n;i++) {
			if(i%2 ==0) {
				System.out.print(a[even--]+" ");
			}
			else {
				System.out.print(a[odd++]+" ");
			}
		}

	}

}
