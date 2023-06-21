package forLoop;
import java.util.Scanner;

public class patternTest2 {
	public static void main(String args[]) {
		//to print this pattern where n= 3
		//*00*00*
		//0*0*0*0
		//00***00
		Scanner s= new Scanner(System.in);
		int n = s.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j==i) {
					System.out.print("*");
				}else {
					System.out.print("0");
				}
			}
			System.out.print("*");
			for(int j=n;j>=1;j--) {
				if(j==i) {
					System.out.print("*");
				}else {
					System.out.print("0");
				}
			}
			System.out.println();
		}
	}
}
