package stringProgram;

import java.util.Scanner;

public class removeConsecutive {
	//remove consecutive duplicate char only
	//aaabbbsssdd=absd
	
	public static String removeConsecutiveDuplicates(String str) {
		if(str.length()==0){
			return str;
		}
        String strN="";
        for(int i=0;i<str.length();){
            char st=str.charAt(i);
            int j=i+1;
            while(j<str.length()&&str.charAt(j)==st){
                j+=1;
            }
            strN+=st;
            i=j;
        }
        return strN;
	}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		System.out.println(removeConsecutiveDuplicates(str));
		
	}

}
