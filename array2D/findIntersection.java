package array2D;

import java.util.Scanner;

public class findIntersection {
	//find similar element in array
	//12345,453787=345
	
	 public static void intersections(int arr1[], int arr2[]) {
	        for(int i=0;i<arr1.length;i++){
	            for(int j=0;j<arr2.length;j++){
	                if(arr1[i]==arr2[j]){
	                    System.out.print(arr1[i]+" ");
	                    arr2[j]=Integer.MIN_VALUE;
	                    break;
	                }
	            }            
	        }
	    }

	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int arr1[]=new int[size];
		for(int i=0;i<size;i++) {
			arr1[i]=s.nextInt();
		}
		int size2=s.nextInt();
		int arr2[]=new int[size2];
		for(int i=0;i<size2;i++) {
			arr2[i]=s.nextInt();
		}
		intersections(arr1,arr2);
	}
}
