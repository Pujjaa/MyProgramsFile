package recursion_2;

import java.util.Scanner;

public class removeConsecutiveChar {
	public static String removeConsecutiveDuplicates(String sr) {
		if(sr.length()==1) {
			return sr;
		}
		String ans="";
		if(sr.charAt(0)!=sr.charAt(1)) {
			ans=ans+sr.charAt(0);
		}
		
		return ans+removeConsecutiveDuplicates(sr.substring(1));
		
	}
	public static void main(String args[]) {
		Scanner s =new Scanner(System.in);
		String sr=s.nextLine();
		String ans=removeConsecutiveDuplicates(sr);
		for(int i=0;i<ans.length();i++) {
			System.out.print(ans.charAt(i));
		}
	}

}
