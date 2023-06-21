package fundamentals;

import java.util.Scanner;
public class charPattern {
	
	public static void main(String args[]) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		//for printing 
		//C
		//BC
		//ABC
	 /*  int i =1;
		while(i<=n) {
			int j=1;
			while(j<=i) {
				char p = (char)(64 + n - i + j);
				System.out.print(p);
				j++;
			}
			System.out.println();
			i++;
		}*/
		
		
		// For printing 
		//A
		//BB
		//CCC
/*		int i = 1;
		while(i<=n) {
			int j = 1;
			char p = (char)('A'+ i - 1);
			while(j<=i) {
				System.out.print(p);
				j++;
			}
			System.out.println();
			i++;
		}*/
		
		
		//For Printing
		//A
		//BC
		//CDE
	/*		int i =1;
		while(i<=n) {
			char p = (char)('A' + i - 1);
			int j=1;
			while(j<=i) {
				System.out.print(p);
				p = (char)(p + 1);
				j++;
			}
			System.out.println();
			i++;
		}*/
		
	}
}

		


