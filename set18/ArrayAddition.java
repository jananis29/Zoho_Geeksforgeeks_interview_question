package set18;

import java.util.Scanner;

public class ArrayAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		int b[] = new int[m];
		for(int i=0;i<m;i++) {
			b[i] = sc.nextInt();
		}
		int result[] = addition(a,b,n,m);
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i]);
		}
 
	}

	private static int[] addition(int[] a, int[] b, int n, int m) {
		// TODO Auto-generated method stub
		int i = n-1;
		int j= m-1;
		int len = Math.max(n, m);
		int result[] = new int[len];
		len--;
		int c=0,r=0;
		while(i>=0 && j>=0) {
			r = a[i--]+b[j--]+c;
			c= r/10;
			result[len--]= r%10;
		}
		while(i>=0) {
			r = a[i--]+c;
			c= r/10;
			result[len--]= r%10;
		}
		while(j>=0) {
			r = b[j--]+c;
			c= r/10;
			result[len--]= r%10;
		}
		if(c!=0) {
			int[] newResult = new int[result.length+1];
			for(int t= newResult.length-1; t> 0; t--){
                newResult[t] = result[t-1];
            }
            newResult[0] = c;
            return newResult;
	  }
	return result;
		
	}

}
