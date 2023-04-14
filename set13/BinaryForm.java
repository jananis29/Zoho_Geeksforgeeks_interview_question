package set13;

import java.util.Scanner;

public class BinaryForm {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        	int n = sc.nextInt();
        	psuedoBinary(n);
    }

	public static void psuedoBinary(int n){
        
        while (n != 0){
            
            int temp = n, m = 0, p = 1;
            while(temp != 0){
                int rem = temp % 10;
                temp = temp / 10;
 
                if (rem != 0)
                    m += p;
 
                p *= 10;
            }
 
            System.out.print(m + " ");
            n = n - m;
        }
        System.out.println(" ");
    }
 


}