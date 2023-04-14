package set21;

import java.util.Scanner;

public class SumOfTwoPrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean flag = false;
		for(int i=2;i<=n/2;i++) {
			if(checkprime(i)==1) {
				if(checkprime(n-i) ==1) {
					System.out.println(i+" "+ (n-i));
						flag = true;
				}
			}
		}
		if(!flag) {
			System.out.println("No sum of prime numbers");
		}

	}

	private static int checkprime(int n) {
		// TODO Auto-generated method stub
		int i, isPrime = 1;
		  if (n == 0 || n == 1) {
		    isPrime = 0;
		  }
		  else {
		    for(i = 2; i <= n/2; ++i) {
		      if(n % i == 0) {
		        isPrime = 0;
		        break;
		      }
		    }
		  }

		  return isPrime;
	
	}

}
