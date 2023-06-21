package array_actual_2d;

import java.util.Scanner;

public class totalSumofBoundariesAndDiagonals {
	
	//1* 2* 3* 10*
	//4* 5* 6* 11*
	//7* 8* 9* 12*		=136(add *)
	//13* 14* 15* 16*
	
	
	//2*  3*  2*  3*  9*
	//2*  3*  4   7*  3*
	//5*  4   7*  5   1*
	//2*  4*  6   7*  2*			=87
	//2*  5*  7*  5*  4*
	
	public static void totalSum(int[][] mat) {

        int sum = 0;
        for(int i = 0 ; i < mat.length ; i++){
             for(int j = 0 ; j < mat[0].length ; j++){
                if(i == j || (i + j) == mat.length - 1) { 
                    sum += mat[i][j];
                }
                else if(j == 0 || j == mat.length -1 || i == 0 || i == mat.length - 1) {
                    sum += mat[i][j];
                }
             }
        }
        System.out.println(sum);

        //Another approach
        /*int sum = 0;
        int n=mat.length-1;
        //for boundaries top/bottom
        for(int j=0;j<mat.length;j++){
            sum+=mat[0][j];
            sum+=mat[n][j];
        }
        //for boundaries left/right
        for(int i=1;i<n;i++){
            sum+=mat[i][0];
            sum+=mat[i][n];
        }
        //for  diagonals
        for(int i=1;i<n;i++){
            sum+=mat[i][i];
            sum+=mat[i][n-i];
        }
        if(mat.length%2==1){
            sum-=mat[mat.length/2][mat.length/2];
        }
        System.out.println(sum);*/

        
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
		 totalSum(arr);
	}
}
