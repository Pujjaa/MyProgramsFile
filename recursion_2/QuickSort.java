package recursion_2;

public class QuickSort {

	public static void quickSort(int[] input) {
		quickSort(input, 0, input.length-1);
	}
	private static void quickSort(int[] input,int startI,int endI) {
		if(startI>=endI)
			return;
		int pivotPos=partition(input,startI,endI);
		quickSort(input, startI, pivotPos);
		quickSort(input, pivotPos+1, endI);
	}
	private static int partition(int[] input, int sI,int eI) {
		int count =0;
		int x=input[sI];
		for(int a=sI+1;a<=eI;a++) {
			if(input[a]<x) {
				count++;
			}
		}
		int pivotPos=sI+count;
		if(count==0)
			return pivotPos;
		else {
			int temp=input[pivotPos];
			input[pivotPos]=input[sI];
			input[sI]=temp;
		}
		int i=sI;
		int j=eI;
		
		while(i<pivotPos) {
			if(input[i]>=input[pivotPos]) {
				while(j>pivotPos) {
					if(input[j]<input[pivotPos]) {
						int temp1=input[i];
						input[i]=input[j];
						input[j]=temp1;
						break;
					}
					j--;
				}
			}
			i++;
		}
		return pivotPos;
	}
	public static void main(String args[]) {
		int input[]= {4,10,2,12,3};
		quickSort(input);
		for(int i=0;i<input.length;i++) {
			System.out.print(input[i]+" ");
		}
	}
}
