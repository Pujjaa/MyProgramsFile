package forLoop;
import java.util.Scanner;

public class sum_or_product {

	public static void main(String args[]) {
		//print sum or product
		//user give the number and choice either 1 or 2
		//print sum(if choice is 1) or product(if choice is 2) till N(1-N)
		
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int C = s.nextInt();
		int i = 1, sum = 0, prod = 1;
		while(i<=N) {
			sum = sum + i;
			prod = prod * i;
			i++;
		}
		if(C==1) {
			System.out.println(sum);
		}else if(C==2) {
			System.out.println(prod);
		}else {
			System.out.println("-1");
		}
	}
}
