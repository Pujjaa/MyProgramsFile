package array_actual_2d;

import java.util.Scanner;

public class rowWiseSum {
	//3 rows 4 cols
	//2 2 3 4
	//5 4 1 2
	//2 3 7 5
	//11 12 17 (sum o/p)
	
	public static void rowWiseSum(int[][] mat) {
		if(mat.length==0){
			return;
		}
		for(int i=0;i<mat.length;i++){
			int sum=0;
			for(int j=0;j<mat[i].length;j++){
				sum+=mat[i][j];
			}
			System.out.print(sum+" ");
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
		 rowWiseSum(arr);
	}
}
