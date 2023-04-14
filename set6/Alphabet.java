package set6;

import java.io.IOException;
import java.util.Scanner;

public class Alphabet {

	private static int count = 0;
	private static char ar[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
			'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

	static void print_word(String str, String str1, int l, int i) {
		if (i > (l - 1)) {
			System.out.println(str1);
			count++;
			return;
		}

		int a = (int) (str.charAt(i));
		print_word(str, str1 + ar[a - 1 - 48], l, i + 1);

		if ((l - 1 - i) >= 1) {
			int b = (int) (str.charAt(i + 1));
			b = b - 48;
			b = (a - 48) * 10 + b;

			if (b <= 26)
				print_word(str, str1 + ar[b - 1], l, i + 2);

		}

	}

	public static void main(String args[]) throws IOException

	{
		Scanner sc = new Scanner(System.in);
		String str, str1;
		str = sc.next();
		str1 = "";

		int l = str.length();
		int i = 0;
		print_word(str, str1, l, i);
//		System.out.println(count);

	}

}
