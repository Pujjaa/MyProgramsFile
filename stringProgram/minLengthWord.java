package stringProgram;
import java.util.Scanner;

public class minLengthWord {
		//minimum length of word in a sentence
	//this is a car 
	//o/p= is
	
		public static String minLengthWord(String input){
			int start=-1;
			int minLen=Integer.MAX_VALUE;
			int end=0;
			int i=0;
			for(;i<input.length();i++){
				if(input.charAt(i)==' '){
					int j=i-end;
					if(j<minLen){
						start=end;
						minLen=j;
					}
					end=i+1;
				}
			}
			if(start==-1){
				return input;
			}else{
				int j=i-end;
				if(j<minLen){
					start=end;
					minLen=j;
				}
				return input.substring(start, start+minLen);
			}
		}
		public static void main(String args[]) {
			 Scanner s=new Scanner(System.in);
			 String str=s.nextLine();
			System.out.println(minLengthWord(str));
		}
	}

