package forLoop;
import java.util.Scanner;
public class patternTest {

	public static void main(String args[]) {
		//to print below pattern where the ith place printed star where n= 3
		//32*
		//3*1
		//*21
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int i=1;
		while(i<=n) {
			int j = n;
			while(j>=1) {
				if(j==i) {
				System.out.print("*");
				}else {
				System.out.print(j);
				}
				j--;
			}
			System.out.println();
			i++;
		}
	}
}
