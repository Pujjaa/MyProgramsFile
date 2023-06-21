package array_actual_2d;

import java.util.Scanner;

public class largestRow_or_Col {
	//largest sum in row or col
	//if in row print "row"
	//if in col print "col"
	
	public static void findLargest(int mat[][]){
	 	int n=mat.length;
       int m;
       if(n==0) {m=0;}
       else {m=mat[0].length;}
       int larRow=Integer.MIN_VALUE;
       int larCol=Integer.MIN_VALUE;
       int indR=0,indC=0,row=0,col=0;
       
       for(int i=0;i<n;i++){
           for(int j=0;j<m;j++){
               row+=mat[i][j];
           }
           if(row>larRow){
               larRow=row;
               indR=i;
           }
           row=0;
       }

       for(int j=0;j<m;j++){
           for(int i=0;i<n;i++){
               col+=mat[i][j];
           }
           if(col>larCol){
               larCol=col;
               indC=j;
           }
           col=0;
       }

       if(larRow >= larCol){
            System.out.print("row" +" " +indR+ " " + larRow);
        }else {
            System.out.print("column" + " " +indC+ " " + larCol);  
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
		 findLargest(arr);
	}
}
