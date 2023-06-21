package function;
import java.util.Scanner;

		//Calculating NCR (factorial program) of formula= n!/r!*(n!-r!)

public class factorial {
	
	public static int factorial(int n) {
		int fac=1;
		for(int i=1;i<=n;i++) {
			fac*=i;
		}
		return fac;
	}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int n= s.nextInt();
		int r=s.nextInt();
		
		int num= factorial(n);
		int den1=factorial(r);
		int den2=factorial(n-r);
		
		int fin= num/(den1*den2);
		System.out.println(fin);
	}
}
