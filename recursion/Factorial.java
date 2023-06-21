package recursion;

public class Factorial {
	
	public static int fact(int n) {
		if(n==0) {
			return 1;
		}
		int factAns=fact(n-1);
		return factAns*n;
	}
	public static void main(String[] args) {
		int n=4;
		System.out.println(fact(n));
	}

}
