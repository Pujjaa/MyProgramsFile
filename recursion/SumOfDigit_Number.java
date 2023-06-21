package recursion;

import java.util.Scanner;

public class SumOfDigit_Number {
	public static int sumofdigit(int n) {
		if(n==0) {
			return 0;
		}
		int sum=sumofdigit(n/10);
		int ans=sum+(n%10);
		return ans;
	}
	

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println(sumofdigit(n));
	}
}
