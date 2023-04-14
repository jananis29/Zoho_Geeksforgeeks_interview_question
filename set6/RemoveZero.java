package set6;

import java.util.Scanner;

public class RemoveZero {
	
	 public static void main(String []args){
		 Scanner sc = new Scanner(System.in);
		 int a= sc.nextInt();
		 int b = sc.nextInt();
	     if (isEqual(a, b) == true)
	    	 System.out.println("Yes");
	     else
	         System.out.println("No");
	 }
	 
    public static int removeZero(int n)
    {
   
        int res = 0;
        int d = 1;
       
        while (n > 0) {
            if (n % 10 != 0) {
       
                res += (n % 10) * d;
                d *= 10;
            }
            n /= 10;
        }
        return res;
    }

    public static boolean isEqual(int a, int b)
    {
        
        if (removeZero(a) + removeZero(b) == removeZero(a + b))
            return true;
       
        return false;
    }

}
