package recursion;

import java.util.Scanner;

public class pi_to_value {
	
	public static String changePi(String src) {
		if(src.length()==0) {
			return src;
		}
		if(src.startsWith("pi")) {
			return "3.14"+changePi(src.substring(2));
		}
		return src.substring(0,1)+changePi(src.substring(1));
	}

	public static void main(String args[]) {
		Scanner s =new Scanner(System.in);
		String src=s.nextLine();
		String ans=changePi(src);
		for(int i=0;i<ans.length();i++) {
			System.out.print(ans.charAt(i));
		}
	}
}
