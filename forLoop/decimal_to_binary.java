package forLoop;
import java.util.Scanner;

public class decimal_to_binary {

	public static void main(String args[]) {
		//decimal to binary
		//10 = 1010, 7= 111
		Scanner s = new Scanner(System.in);
		long n = s.nextLong();
		long rev=0L, i=1L;
		for(;n!=0;) {
		long rem = n%2;
		n/=2;
		rev= rev+rem*i;
		i*=10;
		}
		System.out.println(rev);
	}
}
