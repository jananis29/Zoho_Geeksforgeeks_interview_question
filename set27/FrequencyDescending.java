package set27;

import java.util.Scanner;

public class FrequencyDescending {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i]= sc.nextInt();
		}
		int fr[] = new int[n];
		
		for(int i=0;i<n;i++) {
			int count = 1;  
			for(int j = i+1; j < n; j++){  
				if(a[i] == a[j]){ 
					count++; 
					fr[j] = -1;
	            }
			}
			if(fr[i]!= -1)
				fr[i]= count;
			
		}
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(fr[i]<fr[j]) {
					fr[i] = (fr[i]+fr[j])-(fr[j] = fr[i]);
					a[i] = (a[i] + a[j])-(a[j] = a[i]);	
				}
			}
			for(int k=0;k<fr[i];k++){
			System.out.println( a[i] + " ");
			}
		
		}}

}
