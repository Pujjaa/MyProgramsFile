package function;
import java.util.Scanner;

public class fibonacciSeries {
	public static boolean fiboCheck(int n) {
		//program that check the number is under the fibonacci series or not
		int sum=0,prev=0,next=1;
		if(n==0) {
			return true;
		}
		for(int i=1;sum<n;i++) {
			sum=prev+next;
			prev=next;
			next=sum;
			if(sum==n){
				return true;
			}
		}
		return false;
	}

	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println(fiboCheck(n));
	}
}
