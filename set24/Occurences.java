package set24;

import java.util.Scanner;

public class Occurences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i]= sc.nextInt();
		}
		int count=0;
		int k = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			if(k == a[i]) {
				count++;
			}
		}
		System.out.println(count);
	}

}
