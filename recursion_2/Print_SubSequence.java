package recursion_2;

import java.util.Scanner;

public class Print_SubSequence {
	//Print subSequnce
//	dhs
//
//	s
//	h
//	hs
//	d
//	ds
//	dh
//	dhs
	public static void PrintSubsequences(String str,String output) {
		if(str.length()==0) {
			System.out.println(output);
			return;
		}
		//not include first character
		PrintSubsequences(str.substring(1),output);
		//include first character
		PrintSubsequences(str.substring(1),output+str.charAt(0));
	}
	
	public static void PrintSubsequences(String str) {
		PrintSubsequences(str,"");
	}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		PrintSubsequences(str);
	}
}
