package recursion;

import java.util.Scanner;

public class ElementPresent {
	
	public static boolean elePre(int[] input, int x) {
		if(input.length==0) {
			return false;
		}
		if(input[0]==x) {
			return true;
		}
		int smallInput[]=new int[input.length-1];
		for(int i=1;i<input.length;i++) {
			smallInput[i-1]=input[i];
		}
		boolean smallAns=elePre(smallInput, x);
		if(smallAns) {
			return true;
		}else {
			return false;
		}
	}

	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int input[]=new int[n];
		for(int i=0;i<n;i++) {
			input[i]=s.nextInt();
		}
		int x=s.nextInt();
		System.out.println(elePre(input, x));
	}
}
