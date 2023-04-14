package set1;

public class Substring {
	public static void main(String[] args) throws Exception{
		String str =  "WELCOMETOOOHOCORPORATION.";
		char a[][] = new char[5][5];
		int k=0;
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				a[i][j]= str.charAt(k);
				k++;
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(j<3) {
				if((a[i][j]=='T') && (a[i][j+1]=='O') && (a[i][j+2]=='O') ) {
					System.out.println(i +","+j);
					System.out.println(i +","+(j+2));
				}}
				if(i<3) {
				if((a[i][j]=='T') && (a[i+1][j]=='O') && (a[i+2][j]=='O') ) {
					System.out.println(i +","+j);
					System.out.println((i+2) +","+(j));
				}}
			}
		}
	}

}
