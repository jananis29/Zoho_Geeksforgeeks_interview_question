package set5;

import java.util.Scanner;

public class RotateMatrix {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		
		int a[][] = new int[r][c];
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		
		 rotatematrix(r,c, a);
	}

	private static void rotatematrix(int r, int c, int[][] a) {
		// TODO Auto-generated method stub
		int m =r, n = c;
		int row =0,col =0;
		 int previous, current;
	      while (row < m && col < n) {
	         if (row + 1 == m || col + 1 == n)
	            break;
	         previous = a[row + 1][col];
	         for (int i = col; i < n; i++) {
	            current = a[row][i];
	            a[row][i] = previous;
	            previous = current;
	         }
	         row++;
	         for (int i = row; i < m; i++) {
	            current = a[i][n-1];
	            a[i][n-1] = previous;
	            previous = current;
	         }
	         n--;
	         if (row < m) {
	            for (int i = n-1; i >= col; i--) {
	               current = a[m-1][i];
	               a[m-1][i] = previous;
	               previous = current;
	            }
	         }
	         m--;
	         if (col < n) {
	            for (int i = m-1; i >= row; i--) {
	               current = a[i][col];
	               a[i][col] = previous;
	               previous = current;
	            }
	         }
	         col++;
	      }
//	      System.out.println("The input_matrix after one rotation: ");
	      for (int i = 0; i < r; i++) {
	         for (int j = 0; j < c; j++)
	         System.out.print( a[i][j] + " ");
	         System.out.println();
	      }
	   }
	}