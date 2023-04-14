package set29;

import java.util.Scanner;

public class AddingDigitsToNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String digit = sc.next();
		int num = sc.nextInt();
		int res =0;
		for(int i=0;i<digit.length();i++) {
			res = (digit.charAt(i)-'0')+ num;
			System.out.print(res);
		}
		
	}

}
