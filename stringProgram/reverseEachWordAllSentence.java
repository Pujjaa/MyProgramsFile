package stringProgram;

import java.util.Scanner;

public class reverseEachWordAllSentence {
	//my name is puja
	//ym eman si ajup
	
	public static String reverseEachWord(String str) {
		String strNew="";
		int st=0;
		int i=0;
		for(;i<str.length();i++){
			 if(str.charAt(i)==' '){
				 String reverse="";
				for(int j=st;j<i;j++){
					reverse=str.charAt(j)+reverse;
				}
				strNew+=reverse+" ";
				st=i+1;
			 }	
		if(i==str.length()-1){
				 String reverse="";
				 for(int j=st;j<=i;j++){
					 reverse=str.charAt(j)+reverse;
				 }	
				 strNew+=reverse;
		}
		}
	return strNew;
	}

	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		System.out.println(reverseEachWord(str));
	}
}
