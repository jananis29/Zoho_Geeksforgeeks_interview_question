package set6;

import java.util.ArrayList;
import java.util.Scanner;

public class Dates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		
		int n = sc.nextInt();
		String date[] = new String[n];
		for(int i=0;i<n;i++) {
			date[i] = sc.nextLine();
		}
	      for(int i = 0; i < n-1; i++) {  
	          for (int j = i + 1; j < n; ++j) {  
	             if (date[i].compareTo(date[j]) > 0) {  
	                String temp = date[i];  
	                date[i] = date[j];  
	                date[j] = temp;  
	             }  
	          }
	          System.out.println(date[i]);
	          
	      }
	     
	}
}
