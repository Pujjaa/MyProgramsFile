package stringProgram;

import java.util.Scanner;

public class removeAllOcc {
	//abbcbbdh
	//b
	//O/P: acdh
	
	public static String removeAllOccurrencesOfChar(String str, char ch) {
		
		String strNew="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=ch){
                strNew+=str.charAt(i);
            }
        }
        return strNew;
	}
	
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		char ch=s.next().charAt(0);
		System.out.println(removeAllOccurrencesOfChar(str,ch));
		
	}

}
