/*
 * 20jy0209 
 * カン シチョウ
 */

import java.util.Scanner;

class Ex008 {
	public static void main(String[] args){
		int m;
		int n;
		int sum;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("input m:");
		m = scan.nextInt();
		System.out.print("input n:");
		n = scan.nextInt();
		
		sum = m + n;
		System.out.print(m + "+" + n + "=" + sum);
	}
}