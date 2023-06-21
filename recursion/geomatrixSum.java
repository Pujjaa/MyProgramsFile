package recursion;

import java.util.Scanner;

public class geomatrixSum {
	
	public static double geomatric(int k) {
		if(k==0){
			return 1;
		}
//		double count=geomatric(k - 1);
		double ans=1 /Math.pow(2, k) + geomatric(k - 1);
		return ans;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int k=s.nextInt();
		System.out.println(geomatric(k));
	}

}

