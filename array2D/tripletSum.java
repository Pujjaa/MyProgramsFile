package array2D;

import java.util.Scanner;

public class tripletSum {
	//number of triplet that sum will be that number
	//238675, 10 = 1
	
	public static int findTriplet(int[] arr, int x) {
        int c=0;
    	for(int i=0;i<arr.length-2;i++){
            for(int j=i+1;j<arr.length-1;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==x){
                        c++;
                    }
                }
            }
                }
        return c;
    }
	 public static void main(String args[]) {
		 Scanner s=new Scanner(System.in);
		 int size=s.nextInt();
		 int arr[]=new int[size];
		 for(int i=0;i<size;i++) {
			 arr[i]=s.nextInt();
		 }
		 int ele=s.nextInt();
		 System.out.println(findTriplet(arr,ele));
	 }


}
