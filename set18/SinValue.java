package set18;

import java.util.Scanner;

public class SinValue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float x = sc.nextFloat();
		int n = sc.nextInt();
		float sum,t;
		 x=(float) (x*3.14/180);
		    t=x;
		    sum=x;
		     
		    for(int i=1;i<=n;i++)
		    {
		        t=(t*(-1)*x*x)/(2*i*(2*i+1));
		        sum=sum+t;
		    }
		System.out.printf("%.1f",sum);
	}

}
