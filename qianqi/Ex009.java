/*
 * 20jy0209 
 * カン シチョウ
 */

import java.util.Scanner;

class Ex009 {
	public static void main(String[] args){
		int deposit;
		int sum = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("1月目?:");
		deposit = scan.nextInt();
		sum += deposit;
		System.out.print("2月目?:");
		deposit = scan.nextInt();
		sum += deposit;
		System.out.print("3月目?:");
		deposit = scan.nextInt();
		sum += deposit;
		System.out.print("合計:" + sum);
	}
}