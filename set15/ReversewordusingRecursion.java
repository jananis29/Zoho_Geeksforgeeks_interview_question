package set15;

import java.util.Scanner;

public class ReversewordusingRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String s[] = str.split(" ");
		reverse(s,s.length-1);
		

	}

	private static void reverse(String[] s, int i) {
		// TODO Auto-generated method stub
		if(i==0) {
			System.out.print(s[i]);
		}
		else {
			System.out.print(s[i]+" ");
			reverse(s, i-1);
		}
	}

	

}
