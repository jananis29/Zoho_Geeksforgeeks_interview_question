package set23;

import java.util.Scanner;

public class Window {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		
		}
		int max = 0;
		int k = sc.nextInt();
		for(int i=0;i<(n-k+1);i++) {
			max = a[i];
			for(int j=i,m=0;m<k;j++,m++) {
				max =greater(max, a[j]);
			}
			System.out.print(max+" ");
		}

	}

	private static int greater(int i, int j) {
		// TODO Auto-generated method stub
		if(i> j) {
			return i;
		}
		return j;
	}

}
