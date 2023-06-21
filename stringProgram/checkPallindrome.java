package stringProgram;
import java.util.Scanner;

public class checkPallindrome {
	public static boolean checkPalin(String str) {
		//It is the efficient approach 
		//(check first(i) and last(n) char then increment&decrement 
		//till both are at the same index or cross each other )
		boolean ans=true;
		int n=str.length()-1;
		
		for(int i=0;i<=n;i++){
			if(str.charAt(i)!=str.charAt(n)){
			    ans=false;
				break;
			}
			n--;
		}
		return ans;
		
		
		// another approach (first reverse than check)
		/* boolean ans=true;
			String str1 = "";
			for(int i=str.length()-1;i>=0;i--){
				str1+=str.charAt(i);
			}
			if(str1.compareTo(str)!=0){
				ans=false;
			}
			return ans;*/
	}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		System.out.println(checkPalin(str));
	}

}
