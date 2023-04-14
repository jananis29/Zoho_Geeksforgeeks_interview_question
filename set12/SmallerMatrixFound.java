package set12;

import java.util.Scanner;

public class SmallerMatrixFound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[][] = new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				a[i][j] = sc.nextInt();
			}
		}
		int m = sc.nextInt();
		int b[][] = new int[m][m];
		for(int i=0;i<m;i++) {
			for(int j=0;j<m;j++) {
				b[i][j] = sc.nextInt();
			}
		}
		boolean flag = false;
		for (int i = 0; i < a.length - b.length + 1; i++) {
            for (int j = 0; j < a[0].length - b[0].length + 1; j++) {
                if (a[i][j] == b[0][0]) {
                    flag = true;
                    for (int k = 0; k < b.length; k++) {
                        for (int l = 0; l < b[0].length; l++) {
                            if (a[i + k][j + l] != b[k][l]) {
                                flag = false;
                                break;
                            }
                        }
                    }
                    if (flag) {
                        System.out.println("Match Found");
                        return;
                    }
                    else {
                    	System.out.println("Match Not Found");
                        return;
                    }
                }
            }
        }

	}

}
