package recursion;

import java.util.Scanner;

public class SumArrayElement {
	public static int SumArray(int[] input) {
	if(input.length==0) {
		return 0;
	}
	if(input.length==1) {
		return input[0];
	}
	
	int smallInput[]=new int[input.length-1];
	for(int i=1;i<input.length;i++) {
		smallInput[i-1]=input[i];
	}
	return input[0]+SumArray(smallInput);
	}

	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int input[]=new int[n];
		for(int i=0;i<n;i++) {
			input[i]=s.nextInt();
		}
		System.out.println(SumArray(input));
	}
}
