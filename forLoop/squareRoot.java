package forLoop;
import java.util.Scanner;
public class squareRoot {
	//Print squareroot of number 9 just integral part not decimal
	//if n is 9 = output is 3
	public static void main(String args[]) {
		Scanner s= new Scanner(System.in);
		int n = s.nextInt();
        int c=0, sq=0;
		for(int i =1;i<=n;i++) {
			sq=i*i;
			if(sq<=n) {
                c=i;
			}else{
                break;
		}
        }
        System.out.println(c);
	}
}
