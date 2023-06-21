package forLoop;
import java.util.Scanner;

public class armstrongNum {
	//program checks the number is armstrong or not
	
	public static void main(String args[]) {
		Scanner s= new Scanner(System.in);
		int n = s.nextInt();
		int arm,c=0,sum=0;
		for(int i=n;i>0;) {
			i=i/10;
			c++;
			}
		for(int j=n;j>0;) {
			arm=j%10;
            j=j/10;
            sum+=(Math.pow(arm,c));
        }
		if(sum==n) {
			System.out.println("true");
		}else {
			System.out.println("false");
        }
	}
}
