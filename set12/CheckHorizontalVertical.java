package set12;

import java.util.Scanner;

public class CheckHorizontalVertical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		int n = sc.nextInt();
		int a[][] = new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				a[i][j] = sc.nextInt();
			}
		}
		checkHV(a,n);

	}

	private static void checkHV(int[][] a, int n) {
		boolean horizontal = true;
        boolean vertical = true;
 
      
        for (int i = 0, k = n - 1; i < n / 2; i++, k--) {
 
            for (int j = 0; j < n; j++) {
               
                if (a[i][j] != a[k][j]) {
                    horizontal = false;
                    break;
                }
            }
        }
        for (int j = 0, k = n - 1; j < n / 2; j++, k--) {
 
            for (int i = 0; i < n; i++) {
               
                if (a[i][j] != a[i][k]) {
                	vertical = false;
                    break;
                }
            }
        }
 
        if (!horizontal && !vertical)
            System.out.println("NO");
 
        else if (horizontal && !vertical)
            System.out.println("HORIZONTAL");
 
        else if (vertical && !horizontal)
            System.out.println("VERTICAL");
 
        else
            System.out.println("BOTH");
    }

}
