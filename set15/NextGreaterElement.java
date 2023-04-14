package set15;

import java.util.Scanner;

public class NextGreaterElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		int a[]= new int[n];
		int b[]= new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
			b[i]= a[i];
		}
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(b[i]>b[j]) {
					b[i] = (b[i]+b[j])- (b[j]=b[i]);
				}
			}
			//System.out.println(b[i]);
		}
		nextGreater(a,b,n);
	}

	private static void nextGreater(int[] a, int[] b, int n) {
		// TODO Auto-generated method stub
		int res [] = new int[n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(a[i]== b[j]) {
					if(j == n-1) {
						res[i] = -1; 
					}
					else {
					res[i] = b[j+1];
					}
				}
			}
		}
		for(int i=0;i<n;i++) {
			if(res[i]==-1) {
				System.out.print(a[i]+ "_ ");
			}
			else {
				System.out.print(a[i]+">");	
				System.out.print(res[i]+" ");
			}
		}
		
	}
}
