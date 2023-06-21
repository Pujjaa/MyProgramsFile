package recursion;

//import java.util.Scanner;

public class char_to_number {
	public static int charToNum(String src) {
		if(src.length()==1) {
			return src.charAt(0)-'0';
		}
		int ans =charToNum(src.substring(1));
		int  b = src.charAt(0)-'0';
		b=(int) (b*Math.pow(10, src.length()-1)+ans);
		return b;
	}


	public static void main(String args[]) {
//		Scanner s =new Scanner(System.in);
		String src="1234";
		int Num=charToNum(src);
		System.out.println(Num);
}
}
