package array_actual_2d;

import java.util.Scanner;

public class print2DArray_ntime_n_minus_1andContinue {
//	3 5				row/col
//	1 2 3 4 5
//	6 7 8 9 1		input
//	2 3 4 5 6
	
	//output
//	1 2 3 4 5 
//	1 2 3 4 5 		3 times
//	1 2 3 4 5 
	
//	6 7 8 9 1 		2 times
//	6 7 8 9 1 		
	
//	2 3 4 5 6 		1 times
	
	
	
	public static void print2DArray(int input[][]) {
		int n=input.length;

	for(int k=0;k<n;k++){
		for(int i=0;i<n-k;i++){
			for(int j=0;j<input[0].length;j++){
				System.out.print(input[k][j]+" ");
			}
			System.out.println();
		}
	}
	}
	public static void main(String args[]) {
		 Scanner s=new Scanner(System.in);
		 int row=s.nextInt();
		 int col=s.nextInt();
		 int arr[][]=new int[row][col];
		 for(int i=0;i<row;i++) {
			 for(int j=0;j<col;j++) {
			 arr[i][j]=s.nextInt();
			 }
		 }
		 print2DArray(arr);
	}
}
