package array2D;

import java.util.Scanner;

public class findLeaders {
	
//	10  size
	
//	7 8 10 7 6 5 8 4 5 1 
	
	//right side of 10 is less then or equal to 10
	//right side of 8 is also less then 8
	//same 5
	//rightmost num is always leaders
	
//=	10 8 5 1 
	
	public static void leaders(int[] input) {
		if(input.length==0){
			return;
		}
		for(int i=0;i<input.length;i++){
			int j;
			for(j=i+1;j<input.length;j++){
				if(input[i]<input[j])
					break;
			}
			if(j==input.length){
				System.out.print(input[i]+" ");
			}
		}
	}
	
	public static void main(String args[]) {
		Scanner s= new Scanner(System.in);
		int size=s.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=s.nextInt();
		}
		leaders(arr);
	}
}
