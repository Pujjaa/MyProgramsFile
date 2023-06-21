package array_actual_2d;

import java.util.Scanner;

public class printSpiral {
//	4 6		row/col
//	1 2 3 4 5 6				left to right
//	7 8 9 10 11 12			top to down
//	13 14 15 16 17 18		right to left
//	19 20 21 22 23 24		bottom to top
	
//	=1 2 3 4 5 6 12 18 24 23 22 21 20 19 13 7 8 9 10 11 17 16 15 14
	
	
	public static void spiralPrint(int matrix[][]){
        int rEnd=matrix.length;
        if(rEnd==0){
            return;
        }
        int cEnd=matrix[0].length;
        int i, cStart=0,rStart=0,total=rEnd*cEnd;
        for(i=0;i<total;){
            //left to right
            for(int j=cStart;i<total&&j<cEnd;j++){
                System.out.print(matrix[rStart][j]+" ");
                i++;
            }
            rStart++;
            //top to bottom
            for(int j=rStart;i<total&&j<rEnd;j++){
                System.out.print(matrix[j][cEnd-1]+" ");
                i++;
            }
            cEnd--;
            //right to left
            for(int j=cEnd-1;i<total&&j>=cStart;j--){
                System.out.print(matrix[rEnd-1][j]+" ");
                i++;
            }
            rEnd--;
            //bottom to top
            for(int j=rEnd-1;i<total&&j>=rStart;j--){
                System.out.print(matrix[j][cStart]+" ");
                i++;
            }
            cStart++;
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
		 spiralPrint(arr);
	}
}
