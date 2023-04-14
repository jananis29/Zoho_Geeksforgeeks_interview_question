package set4;

import java.util.Scanner;

public class Petrol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int petrol = sc.nextInt();
		int n = sc.nextInt();
		String bunks[] = new String[n];
		System.out.println("Petrol Bunks");
		for(int i=0;i<n;i++) {
			bunks[i] = sc.next();
		}
		System.out.println("Bunks Distance");
		int dis[] = new int[n];
		for(int i=0;i<n;i++) {
			dis[i] = sc.nextInt();
		}
		System.out.println("Capacities");
		int cap[] = new int[n];
		for(int i=0;i<n;i++) {
			cap[i] = sc.nextInt();
		}
		int rem =petrol;
		for(int i=0;i<n;i++) {
			rem = rem-dis[i]+cap[i];
		}
		System.out.println(rem);

	}

}
