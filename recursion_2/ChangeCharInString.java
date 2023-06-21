package recursion_2;

import java.util.Scanner;

public class ChangeCharInString {

	public static String replaceCharacter(String input, char c1, char c2) {
		if(input.length()==0) {
			return input;
		}
		
		if(input.charAt(0)==c1) {
			return c2+replaceCharacter(input.substring(1),c1,c2);
		}else {
			return input.charAt(0)+replaceCharacter(input.substring(1),c1,c2);
		}
		}
	
	public static void main(String args[]) {
		Scanner s =new Scanner(System.in);
		String src=s.nextLine();
		char c1='a';
		char c2='x';
		String ans=replaceCharacter(src,c1,c2);
		for(int i=0;i<ans.length();i++) {
			System.out.print(ans.charAt(i));
		}
	}
	}
