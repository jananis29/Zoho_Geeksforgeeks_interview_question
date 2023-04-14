package set5;

import java.util.ArrayList;
import java.util.Scanner;

public class LargestPrimenumber {

static ArrayList <Long> list  = new ArrayList<Long>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		permutation(a, 0,n-1);
		Large(list);

	}

	private static void Large(ArrayList<Long> list2) {
		
		for(int i=list2.size()-1;i>=0;i--) {
			long val = list.get(i);
			boolean k = (primenumber(val));
			if(k) {
				System.out.print(val);
				break;
			}
		
		}
		
		
	}

	private static boolean primenumber(long n) {
		// TODO Auto-generated method stub
		int i;
		long m=0;      
		  m=n/2;      
		  if(n==0||n==1){  
		   return false;     
		  }else{  
		   for(i=2;i<=m;i++){      
		    if(n%i==0){      
		     return false;    
		           
		    }      
		   }      
		  }
		
		return true;
	}

	private static void permutation(int[] a, int s, int e) {
		if(s == e) {
			long val =a[0];
			for(int i=0;i<a.length;i++) {
//				System.out.print(a[i]+" ");
				if(i != 0 && a[i]<10 )
				val = ((val*10)+a[i]);
				else if(i!=0 && a[i]>=10 && a[i]<100) {
					val = (val*100)+a[i];
				}
				else if(i!=0 && a[i]>=100 && a[i] <1000) {
					val = (val*1000)+a[i];
				}
//				System.out.print(val +" ");
			}
//			System.out.println("val :" +val);
			list.add(val);
			
		}
		else {
			 for(int i=s;i<=e;i++) {
				 
				 if(check(a,s,i)==1) {
				 
					 a[s] = ((a[s]+a[i])-(a[i]=a[s]));
					 
					 permutation(a, s+1,e);
					 a[s] = ((a[s]+a[i])-(a[i]=a[s]));
				 }
			 }
				 
		 }
//		System.out.println();
	
	}

	private static int check(int[] a, int s, int i) {
		// TODO Auto-generated method stub
		while(s<i) {
			if(a[i]==a[s])
				return 0;
			s++;
		}
		return 1;
	}

}
