package set12;

import java.util.Scanner;

public class SquareNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int val =0;
		for(int i=1;i<b/2;i++) {
			val = i*i;
			if(val >=a && val<=b) {
				System.out.println(val);
			}
		}

	}

}
