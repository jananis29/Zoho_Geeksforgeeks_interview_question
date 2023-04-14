package set24;

import java.util.Scanner;

public class Convertbase7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s=0;
		do {
			int digit = (n%7);
			s= s*10+digit;
			n /=7;
		}while(n>0);
		System.out.println(s);

	}

}
