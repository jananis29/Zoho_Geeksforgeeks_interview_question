package set26;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int p = (int) Math.pow(2,n);
		print(n, p);
	}

	private static void print(int n, int p) {
		// TODO Auto-generated method stub
		for(int i=0;i<p;i++) {
			Binary(i,n);
		}
	}

	private static void Binary(int i, int n) {
		// TODO Auto-generated method stub
		int binary[] = new int[40];    
	     int index = 0;    
	     while(i > 0){    
	       binary[index++] = i%2;    
	       i = i/2;    
	     }    
	     for(int j = n-1;j >= 0;j--){    
	       System.out.print(binary[j]);    
	     }    
	System.out.println();
	}

}
