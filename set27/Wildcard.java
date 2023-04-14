package set27;

import java.util.Scanner;

public class Wildcard {
		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			String pat = sc.nextLine();
			String text = sc.nextLine();
			System.out.println(wildCard(pat, text));

		}

		static boolean wildCard(String pattern, String str) {

			int x = pattern.length();
	        int y = str.length();
	        
	        return isStringMatchingByMem(pattern, str, x - 1, y - 1) ? true :false;
	    }
	    
	    static boolean isStringMatchingByMem(String s1, String s2, int x, int y) {
	        if (x < 0 && y < 0) return true;
	        if (x < 0) return false;
	        if (y < 0) {
	            for (int i = 0; i < x; i++) {
	                if (s1.charAt(i) != '*') {
	                    return false;
	                }
	            }
	            return true;
	        }
	        if(s2.contains(s1)) {
	        	return true;
	        }
	        if (s1.charAt(x) == s2.charAt(y) || s1.charAt(x) == '?') {
	            return isStringMatchingByMem(s1, s2, x - 1, y - 1);
	        } else if (s1.charAt(x) == '*') {
	            return isStringMatchingByMem(s1, s2, x - 1, y) ||
	                    isStringMatchingByMem(s1, s2, x, y - 1);
	        }
	        return false;
	    
	}

}
