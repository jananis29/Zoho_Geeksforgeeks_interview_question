package set13;

import java.util.Scanner;

public class CountDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(totaldigits(n));
	}

	private static int totaldigits(int n) {
		int count =0;
		for(int i=1;i<= n;i*=10) {
			count = count +(n-i+1);
		}
		return count;
	}
}