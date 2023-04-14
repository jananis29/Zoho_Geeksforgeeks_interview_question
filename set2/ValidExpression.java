package set2;

import java.util.Scanner;

public class ValidExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int t=0,i, n= str.length();
		for( i=0;i<n;i++) {
			if( str.charAt(i)== '(') {
				t++;
			}
			else if(str.charAt(i)==')')
			    t--;
			else if(str.charAt(i) =='*' ||str.charAt(i) =='/' ||str.charAt(i) =='+' ||str.charAt(i) =='-') {
				if( str.charAt(i-1)>96 && str.charAt(i-1)<123 && str.charAt(i+1)>96 && str.charAt(i+1)<123) {
					
				}else
					break;
			}

		}
		if(i==n && t==0)
			  System.out.println("Valid");
			else
			  System.out.println("Invalid ");

	}

}
