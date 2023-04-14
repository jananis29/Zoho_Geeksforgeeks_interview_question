package set4;

import java.util.Scanner;

public class Oddnumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int strt = sc.nextInt();
		int end = sc.nextInt();
		for(int i=strt;i<end;i++) {
			if(i%2 !=0) {
				System.out.println( i +" ");
			}
		}
	}

}
