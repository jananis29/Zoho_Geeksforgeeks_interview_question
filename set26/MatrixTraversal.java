package set26;

import java.util.Scanner;

public class MatrixTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i=0,j=0;
		int a[][] = new int [n][n];
		for(int r =0;r<n;r++) {
			for(int c=0;c<n;c++) {
				a[r][c]= sc.nextInt();
			}
		}
//		System.out.println(a.length);
		MatrixTraverse(a,i,j);
	}

	private static boolean MatrixTraverse(int[][] a, int i, int j) {
	
		if(i >=(a.length-1) && j >= (a.length-1) ) {
			for(int r=0;r<a.length;r++) {
				for(int c =0;c<a.length;c++) {
					System.out.print(a[r][c]+" ");
				}
				System.out.println();
			}
			
			return true;
		}
		
		else {
			if(a[i][j] == 1) {
				a[i][j]= 7;
				return ((MatrixTraverse(a, i,j+1)) ||(MatrixTraverse(a, i+1,j)));
						
			}
			
		}
		return false;
	}

}
