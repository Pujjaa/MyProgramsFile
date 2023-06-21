package array2D;

import java.util.Scanner;

public class arrayArrayElement {
	//input a particular number
	//1=1
	//2=12
	//3=132
	//4=1342
	//5=13542
	//6=135642
	
	
	public static void arrange(int[] arr, int size) {
        int inc=0,dec=size-1;
        for(int c=1;inc<=dec;c++){
          if (c%2==1){
                arr[inc]=c;
                inc++;
            }else{
                arr[dec]=c;
                dec--;
            }
        }
        
        //  int m;
        // if(size % 2 == 0) {
        //     m=size / 2;
        // }
        // else{
        //     m=(size+1) / 2;
        // }

        // int count=0;
        // for(int i = 1;i<=size;i++){
        //     if(i%2!=0 && count < m) {
        //         // System.out.print(i +" ");
        //         arr[count] = i;
        //         count++;
        //     }
        // }
        // count = m;
        // for(int i = size;i>0;i--){
        //     if(i%2==0 && count < size) {
        //         // System.out.print(i +" ");
        //         arr[count] = i;
        //         count++;
        //     }
        // }
    }
	
	
	public static void main(String args[]) {
		Scanner s= new Scanner(System.in);
		int x=s.nextInt();
		int arr[]=new int[x];
		arrange(arr,x);
		for(int i=0;i<x;i++) {
			System.out.print(arr[i]);
		}
	}
	

}
