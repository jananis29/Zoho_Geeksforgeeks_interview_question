package set3;

import java.util.Scanner;

public class Substring {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		 int res = isSubstring(str1, str2);
		 
	        if (res == -1)
	            System.out.println("-1");
	        else
	            System.out.println(res);

	}

	private static int isSubstring(String str1, String str2) {
		 int M = str1.length();
	        int N = str2.length();
	 
	       
	        for (int i = 0; i <= M - N; i++) {
	            int j;
	 
	            for (j = 0; j < N; j++)
	                if (str1.charAt(i + j) != str2.charAt(j))
	                    break;
	 
	            if (j == N)
	                return i;
	        }
	 
	        return -1;
	}
}
