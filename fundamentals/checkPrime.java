package fundamentals;

import java.util.Scanner;
import java.lang.Math;

public class checkPrime {
	
	public static void main(String args[]) {
		
		Scanner s = new Scanner(System.in);
		int basic = s.nextInt();
		char c = s.next().charAt(0);
		int allow;
		if(c == 'A') {
			allow = 1700;
		}else if(c == 'B') {
			allow = 1500;
		}else {
			allow = 1300;
		}
		double totalSal = ((basic + (0.20 * basic) + (0.50 * basic) + allow) - (0.11 * basic));
		double totalRound = Math.round(totalSal);
		int sal = (int)(totalRound);
		System.out.println(sal);
	}

}
