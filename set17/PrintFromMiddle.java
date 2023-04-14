package set17;
import java.util.Scanner;

public class PrintFromMiddle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int len = str.length();
		String s = "";
		for(int i=len/2;i<len;i++) {
			s +=str.charAt(i);
		}
		for(int i=0;i<len/2;i++) {
			s +=str.charAt(i);
		}
		System.out.println(s);
		for(int i=0;i<len;i++) {
			for(int b=(2*(len-i)+1);b>=i;b--){
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print(s.charAt(j));
			}
			System.out.println();
		}
		
	}
	
	

}
