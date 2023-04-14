package set18;

import java.util.Scanner;

public class MultiplicationUsingPlus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(multiplier(a,b));
	}
	public static int multiplier(int a, int b) {
	    int resultat = 0;
	    for (int i = 0; i < a; i++) {
	        resultat += b;
	    }
	    return resultat;
	}

}
