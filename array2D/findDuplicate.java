package array2D;

import java.util.Scanner;

public class findDuplicate {
	//find duplicate in array element
	
	public static int duplicateNumber(int arr[]) {
        int found=0;
    	for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i!=j&&arr[i]==arr[j]){
                    found=arr[i];
                }
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
		System.out.println(duplicateNumber(arr));
	}

}
