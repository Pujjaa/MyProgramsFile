package fundamentals;

import java.util.Scanner;

public class sumEvenOdd {
	
	public static void main(String args[]) {
		
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int ind,even=0,odd=0;
		
		while (N > 0) {
			ind = N % 10;
			N = N/10;
			
			if(ind % 2 == 0) {
				even = even + ind;
			}else {
				odd = odd + ind;
			}
		}
		System.out.print(even+ " " +odd);
	}
}
