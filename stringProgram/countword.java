package stringProgram;

import java.util.*;

public class countword {
	public static int countWd(String str) {
		if(str.length()==0) {
			return 0;
			}
		int count=1;
			for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == ' ') {
			count++;
			}
			}
			return count;
	}
		public static void main(String args[]) {
			Scanner sc=new Scanner(System.in);
			String str=sc.nextLine();
			System.out.print(countWd(str));
		}

}
