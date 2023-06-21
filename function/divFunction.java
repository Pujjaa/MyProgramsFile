package function;
import java.util.Scanner;

public class divFunction {
	//return type for int
	public static int divNum(int a,int b) {
		if(b==0) {
			return Integer.MIN_VALUE;
		}
		return a/b;
	}
	//return type for double 
	public static double divNum(double a,double b) {
		if(b==0) {
			return Double.MIN_VALUE;
		}
		return a/b;
	}
	//void type 
	public static void printDivNum(int a,int b) {
		if(b==0) {
			System.out.println("numerator 0 is not applicable for further process");
			return;
		}
		System.out.println(a/b);
	}
	
	

	public static void main(String args[]) {
		Scanner s= new Scanner(System.in);
		int num=s.nextInt();
		int den=s.nextInt();
		double n=s.nextDouble();
		double d=s.nextDouble();
		System.out.println(divNum(num,den));
		System.out.println(divNum(n,d));
		printDivNum(num,den);
	}
}
