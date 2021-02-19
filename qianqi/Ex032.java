/*
 * 20jy0209 
 * カン シチョウ
 */

import java.util.Scanner;

class Ex032{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int[] data = new int[5];
		int i;
		for(i=0;i<data.length;i++){
			data[i] = scan.nextInt();
		}
		for(i=data.length-1;i<data.length && i>=0;i--){
			System.out.println(data[i]);
		}
	}
}
