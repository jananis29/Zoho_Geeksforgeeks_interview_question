package set1;

import java.util.Scanner;

public class Sumofweights {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		int temp;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(a[i]>a[j]) {
				temp = a[i];
				a[i]= a[j];
				a[j]= temp;
			}
			}
		}
		int weg[]= new int[n];
		for(int i=0;i<n;i++) {
			weg[i] = 0;
			int sq = (int) Math.sqrt(a[i]);
			if ((sq * sq) == a[i])
				weg[i] = weg[i] + 5;
			
			if((a[i]%4 == 0) &&(a[i]%6 == 0))
				weg[i] +=4;
			
			if(a[i]%2 ==0)
				weg[i] +=3;
			
			System.out.println("<"+a[i]+" , "+weg[i]+">");
		}
		
	}
}
