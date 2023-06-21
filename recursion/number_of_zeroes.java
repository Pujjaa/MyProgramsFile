package recursion;

import java.util.Scanner;

public class number_of_zeroes {
	
	private static int countZeroes(int n) {
		if(n==0) {
			return 1;
		}
		if(n<10) {
			return 0;
		}else
		 return countZeroes(n/10)+countZeroes(n%10);
//		if(n%10==0) {
//			return 1+countZeroes(n/10);
//		}else {
//			return countZeroes(n/10);
//		}
	}	

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println(countZeroes(n));
	}
}
