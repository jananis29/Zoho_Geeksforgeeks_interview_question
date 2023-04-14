package set25;

import java.util.Scanner;

public class PasswordStrength {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int passwordLength=8, upChars=0, lowChars=0;
	      int special=0, digits=0;
	      char ch;
	      Scanner s = new Scanner(System.in);
	      
	      System.out.print("Enter the Password: ");
	      String password = s.nextLine();
	      
	      int total = password.length();
	      if(passwordLength>total) {
	    	  System.out.println("\nThe Password is Weak.");
	      }
	      else {
	         for(int i=0; i<total; i++)
	         {
	            ch = password.charAt(i);
	            if(Character.isUpperCase(ch))
	               upChars = 1;
	            else if(Character.isLowerCase(ch))
	               lowChars = 1;
	            else if(Character.isDigit(ch))
	               digits = 1;
	            else
	               special = 1;
	         }
	         int count = upChars +lowChars+digits+special;
	      
	         if(count ==4) {
	        	 System.out.println("\nThe Password is Strong.") ;
	         }
	         else if(count==3){
	        	 System.out.println("\nThe Password is Good.");
	         }
	         else if(count ==2) {
	        	 System.out.println("\nThe Password is Medium.");
	         }
	         else
	        	 System.out.println("\nThe Password is Weak.");
	   }
	}
}
