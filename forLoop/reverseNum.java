package forLoop;
import java.util.Scanner;

public class reverseNum {
	public static void main(String args[]) {
		//print reverse number 
		//if last digit is 0 then it is not printed
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int result=0;
		if(n==0) {
			System.out.println("0");
		}else {
		for (; n!=0;) {
		int rev = n%10;
		n= n/10;
		result=result*10+rev;
		}
		System.out.print(result);
		}
	}

}
