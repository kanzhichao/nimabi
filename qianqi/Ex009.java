/*
 * 20jy0209 
 * �J�� �V�`���E
 */

import java.util.Scanner;

class Ex009 {
	public static void main(String[] args){
		int deposit;
		int sum = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("1����?:");
		deposit = scan.nextInt();
		sum += deposit;
		System.out.print("2����?:");
		deposit = scan.nextInt();
		sum += deposit;
		System.out.print("3����?:");
		deposit = scan.nextInt();
		sum += deposit;
		System.out.print("���v:" + sum);
	}
}