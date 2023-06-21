package recursion;

import java.util.Scanner;

public class Remove_x {
	public static String removeX(String src) {
		if(src.length()==0) {
			return "";
		}
		String s="";
		if(src.charAt(0)!='x') {
			s+=src.charAt(0);
		}
		String ans=removeX(src.substring(1));
		return s+ans;
		
//		if(src.charAt(0)=='x'){
//			return removeX(src.substring(1));
//		}
//		return src.substring(0,1)+removeX(src.substring(1));
	}
	
	public static void main(String args[]) {
		Scanner s =new Scanner(System.in);
		String src=s.nextLine();
		String ans=removeX(src);
		for(int i=0;i<ans.length();i++) {
			System.out.print(ans.charAt(i));
		}
}
}
