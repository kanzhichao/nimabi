/*
 * 20jy0209 
 * カン シチョウ
 */

import java.util.Scanner;

class Ex010{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("input a:");
		int a = scan.nextInt();
		System.out.print("input b:");
		int b = scan.nextInt();
		
		if(a == b){
			System.out.print("等しい\n");
		}
	}
}