package set12;

import java.util.Scanner;

public class SortAlternatiely {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int a[]= new int[n];
			for(int i=0;i<n;i++) {
				a[i]= sc.nextInt();
			
			}
			
			for(int i=0;i<n;i++) {
				for(int j=i+1;j<n;j++) {
					if(a[i]>a[j]) {
						a[i] = (a[i]+a[j]) - (a[j]= a[i]);
					}
				}
//				System.out.println(a[i]);
			}
			int odd =0,even =n-1;
			for(int i=0;i<n;i++) {
				if(i%2 ==0) {
				System.out.println(a[even--]);
				}
				else
					System.out.println(a[odd++]);
			}
	}

}
