package fundamentals;

import java.util.Scanner;

public class showFahrenhite {
	
	public static void main(String[] args) {
	
	Scanner s = new Scanner(System.in);
	int S = s.nextInt();
	int E = s.nextInt();
	int W = s.nextInt();
	 
	while(S <= E) {
		System.out.print(S);
		int Celsius = ((S-32)*5)/9;
		System.out.print(" "+Celsius);
		System.out.println();
		S = S + W;
	}
	
	}
}
	
