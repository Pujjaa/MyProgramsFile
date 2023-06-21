package function;

import java.util.Scanner;

public class primeFunction {
//	check the numbers is prime or not(true or false) || print number till n
		public static boolean isPrime(int n) {
			int d=2;
			while(d<n) {
				if(n%d==0) {
					return false;
				}
				d++;
			}
			return true;
		}
		public static void printTilln(int n) {
			if(n<=0) {
				return;
			}
			for(int i =1;i<=n;i++) {
				System.out.println(i);
			}
		}
		public static void main(String args[]) {
			Scanner s=new Scanner(System.in);
			int n =s.nextInt();
			printTilln(n);
			
	boolean ansPrime=isPrime(n);
	System.out.println(ansPrime);
}
}
