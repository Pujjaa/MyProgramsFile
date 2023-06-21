package forLoop;
import java.util.Scanner;

public class seriesNum {
	//print the n number of series (3n+2)
	//not divisible by 4
	//if n = 5 print 5 11 14 17 23
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i =1; i<=n; i++) {
			int x = 3*i+2;
			if (x%4!=0) {
				System.out.print(x+" ");
			}else {
				n++;
			}
		}
	}

}
