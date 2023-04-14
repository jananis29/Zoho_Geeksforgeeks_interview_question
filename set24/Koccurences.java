package set24;

import java.util.Scanner;

public class Koccurences {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char ch[] = str.toCharArray();
		char k= sc.next().charAt(0);
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(k == ch[i]) {
					count++;
			}
		}
		System.out.println(count);

	}

}
