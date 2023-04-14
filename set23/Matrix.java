package set23;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Matrix {

	
	public static void main(String[] args)
	 {  
		Scanner sc=new Scanner(System.in);
				int r=sc.nextInt();
				int c=sc.nextInt();
				int[][] a=new int [r][c];
				for(int i=0;i<r;i++)
					for(int j=0;j<c;j++)
						a[i][j]=sc.nextInt();
				Matrix g=new Matrix();
				ArrayList<ArrayList<Integer>> arr = g.uniqueRow(a,r,c);
				for(int i = 0;i<arr.size();i++){
				    ArrayList<Integer> demo = arr.get(i);
				    for(int j = 0;j<demo.size();j++){
				        System.out.print(demo.get(j)+" ");
				    }
				    System.out.println();
				}
				System.out.println();
			}
	

    public static ArrayList<ArrayList<Integer>> uniqueRow(int a[][],int r, int c)
    {
        
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i< a.length ;i++)
        {
            int sum =0;
            ArrayList<Integer> ll = new ArrayList<>();
            for(int j =0 ;j< a[0].length ;j++)
            {
                ll.add(a[i][j]);
              sum = sum*10+a[i][j];  
            }
            
            if(!set.contains(sum))
            {
                set.add(sum);
                list.add(ll);
            }
        }
        
        return list;
    }

}
