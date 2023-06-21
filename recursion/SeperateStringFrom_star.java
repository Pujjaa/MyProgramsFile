package recursion;

import java.util.Scanner;

public class SeperateStringFrom_star {
	
	
	public static String addstar(String input) {
		if(input.length()==1) {
			return input;
		}
		if(input.charAt(0)==input.charAt(1)) {
			return input.substring(0,1)+'*'+addstar(input.substring(1));
		}else {
			return input.substring(0,1)+addstar(input.substring(1));
		}
	}
	public static void main(String args[]) {
		Scanner s =new Scanner(System.in);
		String input=s.nextLine();
		String ans=addstar(input);
		for(int i=0;i<ans.length();i++) {
			System.out.print(ans.charAt(i));
		}
}
}
