package set12;

import java.util.Scanner;

public class Threshold {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i =0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		int tre = sc.nextInt();
		
		int val[]= new int[n]; 
		for(int i=0;i<n;i++) {
			int count=0,sum=0;
			if(a[i]>tre) {
				while(a[i] > sum) {
					sum = sum+tre;
					count++;
					
				}
			}
			else {
				count++;
			}
			val[i] = count;
			
		}
		int sum=0;
		for(int i=0;i<n;i++) {
			System.out.println(val[i]);
			sum= sum+val[i];
		}
		System.out.println(sum);
	}

}
