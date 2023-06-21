package stringProgram;
import java.util.Scanner;

public class reverseString {
	public static String reverseStr(String str) {
		String rvsString= "";
		for(int i=str.length()-1;i>=0;i--) {
			rvsString += str.charAt(i);
//		for(int i=0;i<str.length();i++) {
//			rvsString = str.charAt(i)+rvsString;
//		}
		}
		return rvsString;
	}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
			String str=s.nextLine();
			System.out.println(reverseStr(str));
	}
}
