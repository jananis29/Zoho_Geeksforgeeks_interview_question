import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String pattern = sc.next();
		String str="" ;
		String s = "";
		for(int i=pattern.length()-1;i>=0;i--) {
			s += pattern.charAt(i);
		}
		for(int i=0;i<s.length();i++) {
			if(pattern.charAt(i) == '?' && s.charAt(i)== '?') {
				str+= 'a';
			}
			else if(pattern.charAt(i) == '?' && s.charAt(i)!= '?') {
				str += s.charAt(i);
			}
			
			else {
				str+= pattern.charAt(i);
			}
			
		}
		String rev ="";
		for(int i= str.length()-1;i>=0;i--) {
			rev+=str.charAt(i);
		}
		if(str.equals(rev)) {
			System.out.println(str);
		}
		else {
			System.out.println("No");
		}
		
	}
}
