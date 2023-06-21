package forLoop;
import java.util.Scanner;

public class binary_to_Decimal {
	public static void main(String args[]) {
		//convert binary to decimal
		//0110 = 6
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	int c = 1, Num=1,deciNum =0;
	if(n==0)
		System.out.println("0");
	for(;n!=0;) {
	int b = n%10;
	n=n/10;
	Num=b*c;
	c=c*2;
	deciNum = deciNum+Num;
	}
	System.out.println(deciNum);
	}
}