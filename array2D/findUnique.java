package array2D;

import java.util.Scanner;

public class findUnique {
	//find unique number in array element
	
	public static int findUnique(int[] arr){
        int found=0;
        for(int i=0;i<arr.length;i++){
            int j=0;
            for(;j<arr.length;j++){
               if( arr[i]==arr[j]&&i!=j){
                   break;
               }
               }
               if(j==arr.length){
                   found = arr[i];
               }
            }
        return found;
    }
	

	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=s.nextInt();
		}
		System.out.println(findUnique(arr));
	}
}
