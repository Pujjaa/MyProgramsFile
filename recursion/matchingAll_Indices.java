package recursion;

import java.util.Scanner;

public class matchingAll_Indices {
	//all indexes where element is same
	
	private static int[] Found(int[] input, int x, int start) {
		if(start>=input.length){
			return new int[0];
		}
		int[] index=Found(input,x,start+1);
		if(input[start]==x){
			int[] ans=new int[index.length+1];
			ans[0]=start;
			for(int i=0;i<index.length;i++){
				ans[i+1]=index[i];
			}
			return ans;
		}
		else return index;
	}
	
	
	public static int[] Found(int[] input,int x) {
		return Found(input,x,0);
	}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int input[]=new int[n];
		for(int i=0;i<n;i++) {
			input[i]=s.nextInt();
		}
		int x=s.nextInt();
		int[] ans=Found(input, x);
		for(int i=0;i<ans.length;i++) {
			System.out.print(ans[i]+" ");
		}
	}
}
