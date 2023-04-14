package set8;

import java.util.Scanner;

public class Permuatation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char[] ch = str.toCharArray();
		permutation(ch, 0,ch.length-1);
	}

	private static void permutation(char[] ch, int s, int e) {
		// TODO Auto-generated method stub
		 if(s == e)
			 System.out.println(ch);
		 else {
			 for(int i=s;i<=e;i++) {
				 
				 if(check(ch,s,i)==1) {
				 
					 ch[s] = (char) ((ch[s]+ch[i])-(ch[i]=ch[s]));
					 permutation(ch, s+1,e);
					 ch[s] = (char) ((ch[s]+ch[i])-(ch[i]=ch[s]));
				 }
			 }
				 
		 }
	}

	private static int check(char[] ch, int s, int i) {
		// TODO Auto-generated method stub
		while(s<i) {
			if(ch[i]==ch[s])
				return 0;
			s++;
		}
		return 1;
	}

}
