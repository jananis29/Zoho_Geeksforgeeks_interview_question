package set23;

import java.util.Scanner;

public class FindLargestamongthree {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int first = sc.nextInt();
		int sec = sc.nextInt();
		int third  = sc.nextInt();
		if(first >= sec && first >= third ) {
			System.out.println(first);
		}
		else if(sec >= first  && sec >= third ) {
			System.out.println(sec);
		}
		else {
			System.out.println(third);
		}
	}

}
