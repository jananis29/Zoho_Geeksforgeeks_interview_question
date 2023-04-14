package set7;

import java.util.Scanner;

public class CyclicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		if(isCyclic(n))
			System.out.print("Yes");
        else
            System.out.print("No");

	}

	static boolean isCyclic(long N)
    {
        long num = N;
        int count = 0;
        int digit = (int)(num % 10);
        boolean allSame = true;
        while (num > 0) {
            count++;
            if (num % 10 != digit)
                allSame = false;
            num = num / 10;
        }
 
        if (allSame == true)
            return false;
 
        if (count % 2 == 0) {
            long halfPower = (long)Math.pow(10, count / 2);
            long firstHalf = N % halfPower;
            long secondHalf = N / halfPower;
            if (firstHalf == firstHalf && isCyclic(firstHalf))
                return false;
        }
 
        num = N;
        while (true) {
            long rem = num % 10;
            long div = num / 10;
            num = (long)(Math.pow(10, count - 1))* rem + div;
 
            if (num == N)
                break;
 
            if (num % N != 0)
                return false;
        }
 
        return true;
    }

}
