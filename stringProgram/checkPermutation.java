package stringProgram;

import java.util.Scanner;

public class checkPermutation {
	//check permutation
	//means first string may rearrange to build second string or not
	//abcd=cbad(true) or abcd=abbc(false)
	
	public static boolean isPermutation(String str1, String str2) {
        int freq[]=new int[256];
        
        for(int i=0;i<str1.length();i++){
            freq[str1.charAt(i)]++;
        }
        for(int i=0;i<str2.length();i++){
            freq[str2.charAt(i)]--;
        }
        for(int i=0;i<str1.length();i++){
            if(freq[str1.charAt(i)]!=0){
                return false;
            }
        }
return true;
}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		String str1=s.nextLine();
		String str2=s.nextLine();
		System.out.println(isPermutation(str1,str2));
	}
}
