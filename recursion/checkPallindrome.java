package recursion;

import java.util.Scanner;

public class checkPallindrome {
	
	private static boolean checkPalindrome(String input,int start,int end) {
		if(start>end) {
			return true;
		}
		if(input.charAt(start)!=input.charAt(end)) {
			return false;
		}
		return checkPalindrome(input,start+1,end-1);
	}
	public static boolean checkPalindrome(String input) {
		return checkPalindrome(input,0,input.length()-1);
	}
	
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		String input=s.nextLine();
		System.out.println(checkPalindrome(input));
	}

}
