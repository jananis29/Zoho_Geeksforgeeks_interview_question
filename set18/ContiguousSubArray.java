package set18;

import java.util.Scanner;

public class ContiguousSubArray {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i]= sc .nextInt();
		}
		System.out.println("\n"+subarraySum(a,n));
	}

	private static int subarraySum(int[] arr, int n) {
		// TODO Auto-generated method stub
		int start=arr[0];
        int end=arr[0];
        for(int i=1;i<n;i++)
        {
            
            if(start>=0)
            {
                start+=arr[i];
                System.out.print(arr[i-1] + " ");
            }
            else 
            {
                start=arr[i];
            }
            if(start>end)
            {
            	end=start;
            	
            }
        }
        return end;
	}
}
