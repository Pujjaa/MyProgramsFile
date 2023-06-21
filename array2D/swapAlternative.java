package array2D;

import java.util.Scanner;

public class swapAlternative {
	//swap alternative number
	//345323=433532, 123456=214356
	
	 public static void swapAlternate(int arr[]){
	        for(int i=0;i<arr.length-1;i+=2) {
			int temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
		}

	    // int temp=0,n=arr.length;
	    //     for(int i=0;i<n-1;i+=2){
	    //      temp=arr[i];
	    //      arr[i]=arr[i+1];
	    //      arr[i+1]=temp;
	    //      }
	    }
	 public static void main(String args[]) {
		 Scanner s=new Scanner(System.in);
		 int size=s.nextInt();
		 int arr[]=new int[size];
		 for(int i=0;i<size;i++) {
			 arr[i]=s.nextInt();
		 }
		 swapAlternate(arr);
		 for(int i=0;i<size;i++) {
			 System.out.print(arr[i]);
		 }
	 }

}
