package set21;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseOnlyVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(modify(str));
	}

	private static String modify(String s) {
char [] ch = s.toCharArray();
        
        ArrayList<Character> a = new ArrayList<>();
        
        for(int i = ch.length-1; i>=0; i--)
        {
            if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i] == 'o' || ch[i] == 'u')
            {
               a.add(ch[i]); 
            }
        }
        
        int j = 0;
        
        for(int i = 0; i<ch.length ; i++)
        {
            if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i] == 'o' || ch[i] == 'u')
            {
                ch[i]=a.get(j);
                j++;
            }
        }
        
        String string = new String(ch);
        s = string;
        return s;
    }

	}
