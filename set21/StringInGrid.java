package set21;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringInGrid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		char ch[][] = new char[][] {{'P','W','K','C','T'},{'B','O','O','F','A','L'},
									{'O','O','E','R','M'},{'X','L','A','T','E'},
									{'A','C','O','T','N'}};
		String find = sc.next();
		int ans[][] = searchword(ch,find);
		for(int i=0;i<ans.length;i++) {
			for(int j=0;j<ans.length;j++) {
				System.out.print(ans[i][j]+" ");
			}
			System.out.println();
		}
		if(ans.length ==0) {
			System.out.println("-1");
		}
 
	}

	private static int[][] searchword(char[][] m, String s) {
		int[][] o=new int[1][1];
        o[0][0]=-1;
        if(m[0].length==1){
        return o;
        }
        int[][] a=new int[1000][3];int d=0;a[0][0]=-1;
        for(int i=0;i<m.length;i++)
        {
            for(int j=0;j<m[0].length;j++)
            {
                char c=m[i][j];
                if(c==s.charAt(0))
                {
                    int x=i,y=j,g=0,p=0;
                    while(m[x][y]==s.charAt(g))
                    {
                        y++;
                        g++;
                        if(g==s.length()){
                        p++;break;}
                         if(y==m[0].length)
                        break;
                    }
                    x=i;y=j;g=0;
                    while(m[x][y]==s.charAt(g))
                    {
                        y--;g++;
                        if(g==s.length())
                        {p++;break;}
                          if(y==-1)
                        break;
                    }
                    x=i;y=j;g=0;
                    while(m[x][y]==s.charAt(g))
                    {
                        x++;
                        g++;
                        if(g==s.length()){
                        p++;break;}
                          if(x==m.length)
                        break;
                    }
                    x=i;y=j;g=0;
                    while(m[x][y]==s.charAt(g))
                    {
                        x--;g++;
                        if(g==s.length())
                        {p++;break;}
                        if(x==-1)
                        break;
                    }
                    x=i;y=j;g=0;
                    while(m[x][y]==s.charAt(g))
                    {
                        x--;
                        y--;
                        g++;
                        if(g==s.length()){
                        p++;break;}
                         if(x==-1||y==-1)
                        break;
                    }
                    x=i;y=j;g=0;
                    while(m[x][y]==s.charAt(g))
                    {
                        x++;g++;y++;
                        if(g==s.length())
                        {p++;break;}
                        if(x==m.length||y==m[0].length)
                        break;
                    }
                    x=i;y=j;g=0;
                    while(m[x][y]==s.charAt(g))
                    {
                        x++;
                        y--;
                        g++;
                        if(g==s.length()){
                        p++;break;}
                         if(x==m.length||y==-1)
                        break;
                    }
                    x=i;y=j;g=0;
                    while(m[x][y]==s.charAt(g))
                    {
                        x--;g++;y++;
                        if(g==s.length())
                        {p++;break;}
                            if(x==-1||y==m[0].length)
                        break;
                    }
                    if(p!=0){
                    a[d][0]=i;a[d][1]=j;d++;}
                }
            }
        }
        if(d==0)
        return o;
        int[][] v=new int[d][2];
        for(int i=0;i<d;i++){
        v[i][0]=a[i][0];
        v[i][1]=a[i][1];}
        return v;
    }
}
