package forLoop;
import java.util.Scanner;

public class fibonacci {
	public static void main(String args[]) {
		
		//fibonacci series = 1 1 2 3 5 8 13
		//print nth element of the series
		//if n = 2 print 1, if n= 4 print 3, if n = 6 print 8 and so on
		
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	int f = 0;
	int n1=0,n2=1;
	for(int i=1; i<=n; i++) {
		if(i==1) {
			f = i;
		}else {
			f = n1+n2;
			 n1=n2;
			 n2=f;
		}
		}
	System.out.println(f);
	}
}
