package set21;

import java.util.Scanner;

public class PalindromeRevrese {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<=5;i++) {
			int rev = reverse(n);
			int val = rev+n;
			int pal = reverse(val);
			if(pal == val) {
				System.out.println(pal);
				break;
			}
			else {
				n = val;
			}
		}
		
	}

	private static int reverse(int n) {
		// TODO Auto-generated method stub
		int rev=0;
		while(n!=0) {
			int rem = n % 10;  
			rev = rev * 10 + rem;  
			n = n/10;  
		}
		return rev;
	}

	

}
