package set6;

import java.util.Scanner;

public class Magicnumber {

	public static void main(String[] args) {

		int n, remainder = 1, number, sum = 0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		number = n;
		while (number > 9) 
		{
			while (number > 0) {
				
				remainder = number % 10;
				sum = sum + remainder;
				number = number / 10;
			}
			number = sum;
			sum = 0;
		}
		if (number == 1) {
			System.out.println("magic number.");
		} else {
			System.out.println("not a magic number.");
		}
	}

}
