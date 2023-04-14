package set14;

import java.util.Scanner;

public class Alphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(titleToNumber(n));
	}

	private static String titleToNumber(int n) {
		 String columnName = "";

		    while (n > 0)
		    {
		        int modulo = (n - 1) % 26;
		        columnName = (char)('A' + modulo) + columnName;
		        n = (n - modulo) / 26;
		    } 

		    return columnName;

	}

}
