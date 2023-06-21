package recursion;

public class SumOf_nNaturalNo {
	
	public static int naturalno(int n) {
		if(n==1) {
			return 1;
		}
		return naturalno(n-1)+n;
	}
	
	public static void main(String args[]){
		int n=5;
		System.out.println(naturalno(n));
	}

}
