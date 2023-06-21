package fundamentals;
import java.util.Scanner;

public class differentTriangle {
	
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		//to print if n= 4
		//1357
		//3571
		//5713
		//7135
		int i = 1;
		int p = 1;
		while(i<=n) {
			int j = 1;
			int c = p;
			while(j<=n-i+1) {
				System.out.print(c);
				j++;
				c=c+2;
			}
			j=1;
			c=1;
			while(j<=i-1) {
				System.out.print(c);
				j++;
				c=c+2;
			}
			System.out.println();
			i++;
			p=p+2;
		}
		
		
		// to print if n= 3
		//1=1
		//1+2=3
		//1+2+3=6
	/* int i = 1;
		int sum = 0;
		while(i<=n) {
			sum=sum+i;
			int j = 1;
			while(j<=i) {
				System.out.print(j);
				if(j==i) {
					System.out.print("=");
				}else {
					System.out.print("+");
				}
				j++;
			}
			
			System.out.println(sum);
			i++;
		}*/
		
		//to print if n= 3
		//***
		// ***
		//  ***
	/*	int i = 1;
		while(i<=n) {
			int sp = 1;
			while(sp<=i-1) {
				System.out.print(" ");
				sp++;
			}
			int j = 1;
			while(j<=n) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}*/
		
		
		//to print if n = 3
		//*
		//*1*
		//*121*
		//*12321*
		//*121*
		//*1*
		//*
	/*System.out.println("*");
		int i = 1;
		while(i<=n) {
			System.out.print("*");
			int j = 1;
			while(j<=i) {
				System.out.print(j);
				j++;
			}
			j = j-2;
			while(j>=1){
				System.out.print(j);
				j--;
			}
			System.out.println("*");
			i++;
		}
		
		i=1;
		while(i<=n-1) {
			System.out.print("*");
			int j=1;
			while(j<=n-i) {
				System.out.print(j);
				j++;
			}
			j=j-2;
			while(j>=1) {
				System.out.print(j);
				j--;
			}
			System.out.println("*");
			i++;
		}
		System.out.print("*");
		*/
		
		
		//to print if n = 3
		//  *
		// ***
		//  *
	/*	int top = (n+1)/2;
		int bottom = n/2;
		
		int i = 1;
		while(i<=top) {
			int sp = 1;
			while(sp<=(top-i)) {
				System.out.print(" ");
				sp++;
			}
			int j = 1;
			while(j<=(2*i)-1) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
		i = bottom;
		while(i>=1) {
			int sp = 1;
			while(sp<=bottom-i+1) {
				System.out.print(" ");
				sp++;
			}
			int j = 1;
			while(j<=(2*i)-1) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i--;
		}*/
		
		
		
		//to print if n = 3
		//  *
		// ***
		//*****
		// ***
		//  *
		
		/*int sp = n-1;
		int j = 1;
		while(j <= n) {
			int i = 1;
			while(i <= sp) {
				System.out.print(" ");
				i++;
			}
			sp--;
			i = 1;
			while(i<=2*j-1) {
				System.out.print("*");
				i++;
			}
			System.out.println();
			j++;
		}
		sp = 1;
		j = 1;
		while(j <= n-1) {
			int i = 1;
			while(i <= sp) {
				System.out.print(" ");
				i++;
			}
			sp++;
			i = 1;
			while(i<= 2*(n-j)-1) {
				System.out.print("*");
				i++;
			}
			System.out.println();
			j++;
		}*/

		
		//to print
		//   1
		//  232
		// 34543
		//4567654
		/*int i = 1;
		while(i<=n) {
			int sp = 1;
			while(sp<=n-i) {
				System.out.print(" ");
				sp++;
			}
			int j = 1;
			int p = i;
			while(j<=i) {
				System.out.print(p);
				p++;
				j++;
			}
			p = i + i - 2;
			j =1;
			while(j<=i-1) {
				System.out.print(p);
				j++;
				p--;
			}
			System.out.println();
			i++;
		}*/
		
		
		
		
		
		//for print
	//    *
	//   ***
	//  *****
	/*	int c = 1;
		 int i=1;
		 while(i<=n) {
			 int sp = 1;
			 while(sp<=n-i) {
				 System.out.print(" ");
				 sp++;
			 }
			 int j =1;
			 while(j<=i+c-1) {
				 System.out.print('*');
				 j++;
			 }
			 System.out.println();
			 c++;
			 i++;
		 }*/
	}

}
