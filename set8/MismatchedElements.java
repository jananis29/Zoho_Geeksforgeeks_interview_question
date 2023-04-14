package set8;

import java.util.Scanner;

public class MismatchedElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String str1 = sc.next();
		int n = str.length();
		int m = str1.length();
		for(int i=0,j=0;(i<n ||j<m);i++,j++) {
			if(str.charAt(i) != str1.charAt(j)) {
				System.out.println(str.charAt(i) +" "+ str1.charAt(j));
			}
		}

	}

}
