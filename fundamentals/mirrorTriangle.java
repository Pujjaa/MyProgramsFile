package fundamentals;
import java.util.Scanner;

public class mirrorTriangle {
	
	public static void main(String args[]) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		//For print
//		333
//		22
//		1
	/*	int i = 1;
		while(i<=n) {
			int j = 1;
			while(j<=n-i+1) {
				System.out.print(n-i+1);
				j++;
			}
			System.out.println();
			i++;
		}*/
		
		
		//for Print
//		****
//		 ***
//		  **
//		   *
	/*	int i = 1;
		while(i<=n) {
			
			int sp = 1;
			while(sp<=i-1) {
				System.out.print(" ");
				sp++;
			}
			
			int j = 1;
			while(j<=n-i+1) {
				System.out.print('*');
				j++;
			}
			System.out.println();
			i++;
		}*/
		
		
		//For Print
//		   1
//		  12
//		 123
	/*	int i = 1;
		while(i<=n) {
			int sp = 1;
			while(sp<=(n-i)) {
				System.out.print(" ");
				sp++;
			}
			
			int j = 1;
			while(j<=i) {
				System.out.print(j);
				j++;
			}
			System.out.println();
			i++;
		}	*/	
	}
}
