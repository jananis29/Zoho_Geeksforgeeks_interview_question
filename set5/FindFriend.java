package set5;

import java.util.Scanner;

public class FindFriend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String a[] = new String[n];
		String b[] = new String[50];
		int c=0;
		for(int i=0;i<n;i++) {
			a[i] = sc.next();
			int t = sc.nextInt();
			for(int j=0;j<t;j++) {
				b[c++] = sc.next();
			}
		}
		int f=0;
		for(int i=0;i<c;i++) {
			f=0;
			for(int k=0;k<n;k++) {
				if(a[k].equals(b[i])) 
					f=1;	
			}
			if(f==0) {
				System.out.println(b[i]);
			}
		}

	}

}
