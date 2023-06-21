package recursion;

import java.util.Scanner;

public class multiplication {
	
	public static int multiply(int x, int n) {
		if(n==0) {
			return 0;
		}
		return x+multiply(x,n-1);
	}
	
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		int n=s.nextInt();
		System.out.println(multiply(x,n));
	}
}
