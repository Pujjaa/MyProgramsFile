package forLoop;
import java.util.Scanner;

public class increasingDecreasing {
	//first increasing and decreasing
	//user= total no.of sequence
	//user= elements of sequence
	//output=true/false
	public static void main(String args[]) {
		 Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			int prev = s.nextInt();
			
			int dec=1,c=0,temp=1;
			if(n==0) {
				System.out.println("false");
			}
			for(int i=1;i<=n-1;i++) {
			int num = s.nextInt();
				if(prev==num ) {
					c=1;
				}else if(prev>num) {
					if(dec==1) {
						prev=num;
	                }else if(temp==1) {
	                	c=1;
	                }
			    }else if(prev<num){
			    	prev=num;
					dec=0;
					temp=1;
				    }	
			}
			if(c==0) {
				System.out.println("true");
			}else{
	            System.out.println("false");
	        }
		}
	}
