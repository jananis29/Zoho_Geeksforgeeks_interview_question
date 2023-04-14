package set23;

import java.util.Scanner;

public class NoofOddandevenelements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		int odd=0,even =0;
		for(int i=0;i<n;i++) {
			if(a[i]%2 ==0) {
				even++;
			}
			else {
				odd++;
			}
		}
		System.out.println("ODD : "+ odd +"\nEven : "+even);
	}
}
