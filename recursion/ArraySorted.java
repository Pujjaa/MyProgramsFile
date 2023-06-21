package recursion;

import java.util.Scanner;

//1st approach whether we first check (n-1) result then first two

public class ArraySorted {
	public static boolean checkSorted(int[] input) {
		if(input.length<=1) {
			return true;
		}
		int smallInput[]=new int[input.length-1];
		for(int i=1;i<input.length;i++) {
			smallInput[i-1]=input[i];
		}
		boolean smallAns=checkSorted(smallInput);
		if(!smallAns) {
			return false;
		}
		if(input[0]<=input[1]) {
			return true;
		}else {
			return false;
		}
	}
	
	//2nd approach whether we first check first two result then (n-1) 
	
	public static boolean checkSorted_2(int[] input) {
		if(input.length<=1) {
			return true;
		}
		if(input[0]>input[1]) {
			return false;
		}
		int smallInput[]=new int[input.length-1];
		for(int i=1;i<input.length;i++) {
			smallInput[i-1]=input[i];
		}
		boolean smallAns=checkSorted_2(smallInput);
		return smallAns;
//		if(smallAns) {
//			return true;
//		}else {
//			return false;
//		}
	}
		
	//3rd approach here we use a variable startIndex and 
	//check it is sorted or not from startIndex to end
	private static boolean checkSortedBetter(int[] input, int startIndex) {
		if(startIndex >= input.length-1) {
			return true;
		}
		if(input[startIndex] > input[startIndex+1]) {
			return false;
		}
		boolean smallAns=checkSortedBetter(input, startIndex+1);
		return smallAns;
}
	public static boolean checkSortedBetter(int[] input) {
		return checkSortedBetter(input,0);
	}
	
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int input[]=new int[n];
		for(int i=0;i<n;i++) {
			input[i]=s.nextInt();
		}
		System.out.println(checkSortedBetter(input));
	}
}
