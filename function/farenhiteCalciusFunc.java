package function;
import java.util.Scanner;
//print calsius value to fahrenhite starting value to end value
public class farenhiteCalciusFunc {
	public static void fahToCaltable(int s, int e, int w) {
		int cal = 0;
		for(int i=s;i<=e;i+=w) {
			cal=((i-32)*5)/9;
			System.out.println(i+"\t"+cal);
		}
	}
	public static void main(String args[]) {
		Scanner s= new Scanner(System.in);
		int S=s.nextInt();
		int E=s.nextInt();
		int W=s.nextInt();
		fahToCaltable(S,E,W);
	}
}

