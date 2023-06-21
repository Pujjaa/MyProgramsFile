package forLoop;
import java.util.Scanner;

public class primeNum {
	public static void main(String args[]) {
		// to print prime numbers till the number that user provide
		// if n=6 output will 1 2 3 5
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int c;
		 for(int i = 1; i<=n; i++) {
			 c=0;
			 for (int j = 2; j<=i/2; j++) {
				 if(i%j==0) {
					 c++;
					 break;
				 }
			 }
			 if (c==0) {
				 System.out.println(i);
			 }
		 }
	}	
}
