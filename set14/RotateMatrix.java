package set14;

import java.util.Scanner;

public class RotateMatrix {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int a[][] = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		while(k>0) {
			transpose(a,n);
			rotate(a,n);
			k--;
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
	}

	private static void rotate(int[][] a, int n) {
		// TODO Auto-generated method stub
		for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n / 2; j++)
            {
                a[i][j] = (a[i][j] + a[i][n-j-1])-(a[i][n-j-1]=a[i][j]);
            }
        }
		
	}

	private static void transpose(int[][] a, int n) {
		// TODO Auto-generated method stub
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				 a[i][j] = (a[i][j] + a[j][i])-(a[j][i]=a[i][j]); // swapping "a = (a+b)-(b=a)"
			}
		}
		
		
		
	}
}  