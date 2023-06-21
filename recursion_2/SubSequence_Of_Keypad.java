package recursion_2;
import java.util.Scanner;

public class SubSequence_Of_Keypad {

	public static String[] keypad(int n){
        if(n <= 1){
            String[] s= {""};
            return s;
        }
        
        String[] smallAns = keypad(n/10);
        String[] helpAns = helpFunc(n%10);
        String[] arrAns = new String[smallAns.length * helpAns.length];
        
        int k = 0;
        for(int i = 0 ;i < smallAns.length;i++){
            for(int j = 0 ;j < helpAns.length;j++){            
                arrAns[k] = smallAns[i] + helpAns[j];
                k++;
            }
        }

        return arrAns;
        
	}
    
    private static String[] helpFunc(int n){
        String[] s = {""};
        if(n == 2){
            s = new String[]{"a","b","c"};
            return s;
        }
        else if(n == 3){
            s =new String[]{"d","e","f"};
            return s;
        }
        else if(n == 4){
            s =new String[]{"g","h","i"};
            return s;
        }
        else if(n == 5){
            s =new String[]{"j","k","l"};
            return s;
        }
        else if(n == 6){
            s =new String[]{"m","n","o"};
            return s;
        }
        else if(n == 7){
            s =new String[]{"p","q","r","s"};
            return s;
        }
        else if(n == 8){
            s =new String[]{"t","u","v"};
            return s;
        }
        else if(n == 9) {
            s =new String[]{"w","x","y","z"};
            return s;
        }
        else return s;
        
    }
    public static void main(String args[]) {
    	Scanner s=new Scanner(System.in);
    	int no=s.nextInt();
    	String str[]=keypad(no);
    	for(int i=0;i<str.length;i++) {
    		System.out.println(str[i]+" ");
    	}
    	}
}
