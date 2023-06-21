package stringProgram;

import java.util.Scanner;

public class printPossiblesubString {
	public static void printSubstrings(String str) {

		for(int i=0;i<str.length();i++){
			for(int j=i;j<str.length();j++){
				System.out.println(str.substring(i,j+1));
			}
		}

		//another approach
		/*for(int i=1;i<=str.length();i++){
			for(int j=0;j<=str.length()-i;j++){
				int k=j+i-1;
				System.out.println(str.substring(j,k+1));
			}
		}*/

		
		//another approach
		/*String subStr="";
		for(int i=0;i<str.length();i++){
			for(int j=i;j<str.length();j++){
				subStr+=str.charAt(j);
				System.out.println(subStr);
			}
			subStr="";
		}*/
	}
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		String str=s.nextLine();
		printSubstrings(str);
	}
}
