package set25;

import java.util.Scanner;

public class Shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		double x3 = sc.nextDouble();
		double y3 = sc.nextDouble();
		double x4 = sc.nextDouble();
		double y4 = sc.nextDouble();
		if(isRectangle(x1,y1,x2,y2,x3,y3,x4,y4)) {
			System.out.println("Rectangle");
		}
		else if(isSquare(x1,y1,x2,y2,x3,y3,x4,y4)) {
			System.out.println("Square");
			
		}
		else {
			System.out.println("Its not neither square or rectangle");
		}

	}

	private static boolean isSquare(double x1, double y1, double x2, double y2, double x3, double y3, double x4,
			double y4) {
		if((x1==x2 && x3==x4)&& (x1==x3 && x2==x4) && (y1==y2 && y3==y4) && (y1==y3 && y2==y4))
	        return false;
	         
			if(Math.abs(x1-x2)==Math.abs(x3-x4) && Math.abs(y1-y2)==Math.abs(y3-y4))
				return true;
				
			return false;
	}

	private static boolean isRectangle(double x1, double y1, double x2, double y2, double x3, double y3, double x4,
			double y4) {
		 double m1,m2,m3;
		    m1 = (y2-y1)/(x2-x1);
		    m2 = (y2-y3)/(x2-x3);
		    m3 = (y4-y3)/(x4-x3);

		    if((m1*m2)==-1 && (m2*m3)==-1)
		        return true;
		    else
		        return false;
	}

}
