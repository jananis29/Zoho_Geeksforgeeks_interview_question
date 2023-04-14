package set4;

import java.util.Scanner;

public class LookandSay {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
		String str =  countAndSay(i);
		System.out.println(str+" ");
		}
	}

	private static String countAndSay(int n) {
		// TODO Auto-generated method stub
		if(n==1)
			return "1";
		String str= countAndSay(n-1);
		String ans= "";
		int count=1;
		int i=1;
		for(i=1; i<str.length(); i++)
		{
			if(str.charAt(i)!=str.charAt(i-1))
			{
				ans= ans+(char)(count+48)+str.charAt(i-1);
				count=1;
			}
			else
				count++;
		}
		ans= ans+(char)(count+48)+str.charAt(i-1);
		return ans;
	}
	

}
