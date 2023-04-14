package set27;

import java.util.Scanner;

public class LeastPrimenumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		int b[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i]= sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			b[i]= sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			primenumber(a[i],b[i]);
			
		}
		
	}

	private static void primenumber(int a, int b) {
		if((a+1)%b ==0) {
			System.out.print("1 ");
			return;
		}
		int j =1,count = 0;
		for(j=1;j<=b;j++) {
			count =0;
			for(int i=2;i<=j/2;i++) {
				if(j%i ==0) {
					count++;
					break;
				}
			}
			if(count == 0 && j!=1) {
				calculate(a,b,j);
			}
		}

	}

	private static void calculate(int a, int b, int j) {
		// TODO Auto-generated method stub
		if(((a+j)%b) == 0) {
			System.out.print(j +" ");
		}
	}
}
