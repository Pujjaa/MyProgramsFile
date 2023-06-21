package fundamentals;

import java.util.Scanner;

public class showFactor {

	public static void main(String args[]) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int div = 2;
		while(div <= n-1) {
		if(n % div == 0) {
			System.out.print(div+ " ");
		}
		div = div + 1;
		}
		
	}
}
