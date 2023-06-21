package stringProgram;
import java.util.Scanner;

public class reverseWord {
	//reverse word 
	//I/p: I am puja
	//O/p: puja am I
	public static String reverseWordWise(String input) {
		String str ="";
		int n=input.length();
		for (int i=n-1;i>=0;i--){
			if(input.charAt(i)==' '){
				str+=input.substring(i+1,n)+" ";
				n=i;
			}
			if(i==0){
				str+=input.substring(i,n);
			 }
		}
		return str;
	}

	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		String input=s.nextLine();
		System.out.println(reverseWordWise(input));
	}
}
