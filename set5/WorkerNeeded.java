package set5;

import java.util.Arrays;
import java.util.Scanner;

public class WorkerNeeded {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		int b[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			b[i] = sc.nextInt();
		}
		System.out.println(findPlatform(a,b,n));

	}
	static int findPlatform(int arr[], int dep[], int n)
    {
        // add your code here
        Arrays.sort(arr);
        Arrays.sort(dep);

        int countTrain=0; 
        int ans=0;
        int i =0; 
        int j =0;

        while(i<n){
            if(arr[i]<=dep[j]){
                countTrain++;
                ans = Math.max(ans, countTrain);
                i++;
            } else {
                countTrain--;
                j++;
            }
        }
        return ans;
    } 

}
