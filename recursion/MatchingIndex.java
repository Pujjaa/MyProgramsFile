package recursion;

import java.util.Scanner;
public class MatchingIndex {
	
	private static int Found(int[] input, int x, int start) {
		if(start >= input.length-1) {
			return -1;
		}
		if(input[start] == x) {
			return start;
		}
		int index=Found(input,x,start+1);
		return index;
	}
	public static int Found(int[] input,int x) {
		return Found(input,x,0);
	}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int input[]=new int[n];
		for(int i=0;i<n;i++) {
			input[i]=s.nextInt();
		}
		int x=s.nextInt();
		System.out.println(Found(input, x));
	}

}
