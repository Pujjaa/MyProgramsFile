package array2D;

import java.util.Scanner;

public class pairSum {
	//how many pairs are to be sum of that particular number
	//1245352 and num is 3 = 2
	
	 public static int pairSum(int arr[], int x) {
	        int c=0;
	       for(int i=0;i<arr.length-1;i++){
	           for(int j=i+1;j<arr.length;j++){
	              if( arr[i]+arr[j]==x){
	                  c++;
	              }
	           }
	       }
	       return c;
	    }
	 public static void main(String args[]) {
		 Scanner s=new Scanner(System.in);
		 int size=s.nextInt();
		 int arr[]=new int[size];
		 for(int i=0;i<size;i++) {
			 arr[i]=s.nextInt();
		 }
		 int ele=s.nextInt();
		 System.out.println(pairSum(arr,ele));
	 }

}
