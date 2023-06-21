package recursion_2;

//import java.util.Scanner;

public class MergeSort {
	public static void mergeSort(int[] input){
	mergeSort(input,0,input.length-1);
	for(int i=0;i<input.length;i++) {
		System.out.print(input[i]+" ");
	}
	}
	
	 private static void mergeSort(int[] input,int start,int end) {
		if(start>=end) {
			return;
		}
		int mid=(start+end)/2;
		mergeSort(input,start,mid);
		mergeSort(input,mid+1,end);
		merge(input,start,end);
	}
	private static void merge(int[] input,int start,int end) {
		int mid = (start+end)/2;
		
		int ans[]=new int[end-start+1];
		int i=start;
		int j=mid+1;
		int k=0;
		while(i<=mid&&j<=end) {
			if(input[i]<input[j]) {
				ans[k]=input[i];
				i++;
				k++;
			}else {
				ans[k]=input[j];
				k++;
				j++;
			}
		}
		while(i<=mid) {
			ans[k]=input[i];
			i++;
			k++;
		}
		while(j<=end) {
			ans[k]=input[j];
			k++;
			j++;
		}
		for(int index=0;index<ans.length;index++) {
			input[start+index]=ans[index];
		}
	}
	
	public static void main(String args[]) {
//		Scanner s =new Scanner(System.in);
//		int size =s.nextInt();
//		int input[]=new int[size];
//		for(int i=0;i<size;i++) {
//			input[i]=s.nextInt();
//		}
		int input[]= {2,1,4,2,3,5};
		mergeSort(input);
}
}
