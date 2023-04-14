package set17;

import java.util.Scanner;

public class ChildandFather {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String a[][] = new String[n][2];
		for(int i=0;i<n;i++) {
			for(int j=0;j<2;j++) {
				a[i][j] = sc.next();
			}
		}
		String child ="";
		int count=0;
		String name  = sc.next();
		for(int i=0;i<n;i++ ) {
			if(a[i][1].equals(name)) {
				child  = a[i][0];
				System.out.println("child :" + child);
				
			}
				for(int j=0;j<n;j++)
				if (child.equals(a[j][1])) {
					System.out.println("children of "+child + " :"+ a[j][0]);

				

			}
		}
		
		
	}
}
