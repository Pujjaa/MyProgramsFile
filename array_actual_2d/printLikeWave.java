package array_actual_2d;

import java.util.Scanner;

public class printLikeWave {
//	4 3 2 3 2		top to bottom
//	6 5 6 4 8		bottom to top
//	6 7 8 4 6
//	4 6 7 9 1
//=	4 6 6 4 6 7 5 3 2 6 8 7 9 4 4 3 2 8 6 1 

	public static void wavePrint(int mat[][]){
		if(mat.length==0){
			return;
		}
		for(int i=0;i<mat[0].length;i++){
			if(i%2==0){
				for(int j=0;j<mat.length;j++){
					System.out.print(mat[j][i]+" ");
				}
			}else{
				for(int j=mat.length-1;j>=0;j--){
					System.out.print(mat[j][i]+" ");
				}
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
		 wavePrint(arr);
	}
}
