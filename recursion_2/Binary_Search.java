package recursion_2;

import java.util.Scanner;

public class Binary_Search {
	
	public static int binarySearch(int[] arr,int sI,int eI,int X) {
		if(sI>eI) {
			return -1;
		}
		int mid=(sI+eI)/2;
		if(arr[mid]==X) {
			return mid;
		}else if(arr[mid]<X) {
			return binarySearch(arr,mid+1,eI,X);
		}else{
			return binarySearch(arr,sI,mid-1,X);	
			}
		}
		
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=s.nextInt();
		}
		System.out.println(binarySearch(arr,0,arr.length-1,4));
	}
}
