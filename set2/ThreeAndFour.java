package set2;

import java.util.Scanner;

public class ThreeAndFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		 int a,count,r;
		for(int i=1;n!=0;i++) {
			a=i;
			count =0;
			while(a>0) {
				r = a%10;
				a/=10;
				count++;
				if(r==3 || r==4)
					count--;
			}
			if(count==0) {
				System.out.print(i+" ");
				n--;
			}
		}
	}

}
