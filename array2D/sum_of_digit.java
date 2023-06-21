package array2D;
import java.util.Scanner;

public class sum_of_digit {
	//first take number of task from user
	//size of array
	//elements of array
	//output elements of array and then next line sum of elements
	
	public static int[] sumofNum() {
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int arr[]=new int[size];
			for(int j=0;j<size;j++) {
				arr[j]=s.nextInt();
			}
		return arr;
		}
	
	public static void sumofnumPrint(int input[]) {
		int sum=0;
		int size=input.length;
		for(int i=0;i<size;i++) {
			sum+=input[i];
			System.out.print(input[i]+" ");
		}
		System.out.println();
		System.out.print(sum);
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++) {
			int arr[]=sumofNum();
			sumofnumPrint(arr);
		}
	}
}
