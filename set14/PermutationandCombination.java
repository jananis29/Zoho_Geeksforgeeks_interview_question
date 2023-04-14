package set14;

import java.util.Scanner;

public class PermutationandCombination {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char ch[] = str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			System.out.print(ch[i]+" ");
		}
		System.out.println();
		
		permutation(ch,0,ch.length-1);
		
	}
	private static void permutation(char[] ch, int s, int l) {
		// TODO Auto-generated method stub
		 if(s == l) {
			 for(int i=0;i<ch.length-1;i++) {
			 		System.out.print(ch[i]); 
			 	 }
			 System.out.println();
			 System.out.println(ch);
		 	
		 	
		 }
		 else {
			 for(int i=s;i<=l;i++) {
				 ch[s] = (char) ((ch[s]+ch[i])-(ch[i]=ch[s]));
				 permutation(ch, s+1,l);
				 ch[s] = (char) ((ch[s]+ch[i])-(ch[i]=ch[s]));
			 }
		 }
	}
}
