package set2;

import java.util.Scanner;

public class RemoveUnbalancedParanthesis {
	 public static void main(String args[])
	    {
	        Scanner input=new Scanner(System.in);
	        System.out.println("Enter the expression:");
	        String expression=input.next();
	        int openParentheses[]=new int[100];
	        int closeParentheses[]=new int[100];
	        int toBeRemoved[]=new int[100];
	        int opIt=0,cpIt=0,toBeRemovedIt=0;        
	        for(int i=0;i<expression.length();i++)
	        {
	            if(expression.charAt(i)=='(')
	            {
	                openParentheses[opIt]=i;
	                opIt++;
	            }
	            if(expression.charAt(i)==')')
	            {
	                closeParentheses[cpIt]=i;
	                cpIt++;
	            }
	            
	        }
	      
	        int greater=(opIt>cpIt)?1:2;   
	        int ParenthesesDiff=Math.abs(opIt-cpIt);
	       
	        
	        for(int i=0;i<ParenthesesDiff;i++)
	        {
	            if(greater==1)
	            {
	                opIt--;
	                toBeRemoved[toBeRemovedIt]=openParentheses[opIt];
	                toBeRemovedIt++;
	            }
	            else if(greater==2)
	            {
	                cpIt--;
	                toBeRemoved[toBeRemovedIt]=closeParentheses[cpIt];
	                toBeRemovedIt++;
	            }
	        }
	        
	    
	        int temp=-100;
	        if(toBeRemovedIt>0)
	        {
	            toBeRemovedIt--;
	            temp=toBeRemoved[toBeRemovedIt];
	        }
	        
	        for(int i=0;i<expression.length();i++)
	        {            
	            if(i==temp)
	            {
	                if(toBeRemovedIt>0)
	                {
	                    toBeRemovedIt--;
	                    temp=toBeRemoved[toBeRemovedIt];
	                }
	            }
	            else
	            {
	                System.out.print(expression.charAt(i));
	            }
	            
	        }
	    }
}
