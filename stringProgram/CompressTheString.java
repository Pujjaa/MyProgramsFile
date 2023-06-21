package stringProgram;

import java.util.Scanner;

public class CompressTheString {
	
	//aaabccdeef
	//a3bc2de2f
	
	public static String getCompressedString(String str) {
		 if(str.length()==0){
			return str;
		}
       String strN="";
       for(int i=0;i<str.length();){
			int j=i+1;
			int c=1;
			while(j<str.length()&&str.charAt(i)==str.charAt(j)){
				c++;
				j++;
			}
			strN+=str.charAt(i);
			if(c>1){
				strN+=c;
			}
			i=j;
       }
       return strN;
	}
	
	
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		System.out.println(getCompressedString(str));
	}
}
