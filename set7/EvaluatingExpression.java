package set7;

import java.util.Scanner;

public class EvaluatingExpression {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    String expr1 = sc.next();
	    int res = evaluate(expr1);
	    if(res == -1) 
	    	System.out.println(expr1+" is Invalid");
	    else     
	    	System.out.println("Value of "+expr1+" is "+res);
	 
	}
	
	static boolean isOperand(char c)
	{
	    return (c >= '0' && c <= '9');
	     
	}

	
	static int value(char c)
	{
	    return (int)(c - '0');
	     
	}
	
	static int evaluate(String exp)
	{
	  
	    if (exp.length() == 0) return -1;
	    int res = value(exp.charAt(0));
	    for (int i = 1; i<exp.length(); i += 2)
	    {
	        char opr = exp.charAt(i), opd = exp.charAt(i+1);
	        if (isOperand(opd) == false) 
	        	return -1;
	        if (opr == '+') 
	        	res += value(opd);
	        else if (opr == '-') 
	        	res -= value(opd);
	        else if (opr == '*') 
	        	res *= value(opd);
	        else if (opr == '/') 
	        	res /= value(opd);
	        else                
	        	return -1;
	    }
	    return res;
	}
	

}
