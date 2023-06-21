package array2D;

import java.util.Scanner;

public class linearSearch {

	 public static int linearSearch(int arr[], int x) {

	        for(int i=0;i<arr.length;i++){
	            if(x == arr[i]) return i;
	        }
	        return -1;
	    }
	 public static void main(String args[]) {
		 Scanner s=new Scanner(System.in);
		 int size=s.nextInt();
		 int x=s.nextInt();
		 int arr[]=new int[size];
		 for(int i=0;i<size;i++) {
			 arr[i]=s.nextInt();
		 }
		 System.out.println(linearSearch(arr,x));
	 }
}
