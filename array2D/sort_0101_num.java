package array2D;

import java.util.Scanner;
	//sorting  0 and 1 that 0 appears first
  	//1 0 1 1 0 0
	//0 0 0 1 1 1 

public class sort_0101_num {

	public static void sortZeroesAndOne(int[] arr) {
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                 int temp=arr[j];
                arr[j]=arr[i];
                 arr[i]=temp;
                 j++;
           }
        }   
   }
	public static void main(String args[]) {
		 Scanner s=new Scanner(System.in);
		 int size=s.nextInt();
		 int arr[]=new int[size];
		 for(int i=0;i<size;i++) {
			 arr[i]=s.nextInt();
		 }
		 sortZeroesAndOne(arr);
		 for(int i=0;i<size;i++) {
			 System.out.print(arr[i]+" ");
		 }
		 
	}
}
