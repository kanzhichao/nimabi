/*
 * 20jy0209 
 * �J�� �V�`���E
 */

import java.util.Scanner;

class Ex040{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int m,n;
		int ans;
		System.out.print("�����鐔����́F");
		m = scan.nextInt();
		System.out.print("���鐔����́F");
		n = scan.nextInt();
		
		ans = divide(m,n);
		System.out.println("���F"+ans);
	}
	
	public static int divide(int dividend,int divisor){
		int quotient;
		quotient = dividend/divisor;
		return quotient ;
	}
}
