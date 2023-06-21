package array2D;

import java.util.Scanner;

public class arraySum {
	//sum of element in array

	public static int sum(int[] arr) {
	     
        int sum=0;        
   
        for(int j=0;j<arr.length;j++)
        {
        	sum=sum+arr[j];    
        }
        return sum;
	}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=s.nextInt();
		}
		System.out.println(sum(arr));
	}
}
