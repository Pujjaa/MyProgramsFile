package stringProgram;

import java.util.Scanner;

public class highestOccuringChar {
	//sbdsssdf
	//s
	
	public static char highestOccuringChar(String str) {
		   int freq[] = new int[256];
	        int maxValue = 0;
	        char output = '\0';
	        for(int i = 0; i < str.length(); i++){
	             freq[str.charAt(i)]++;
	        }
	        for(int i=0;i<str.length();i++){
	             if(maxValue<freq[str.charAt(i)]){
	                  maxValue=freq[str.charAt(i)];
	                  output=str.charAt(i);
	             }
	        }
	        return output;
	     }
	
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		System.out.println(highestOccuringChar(str));
	}
	
}
