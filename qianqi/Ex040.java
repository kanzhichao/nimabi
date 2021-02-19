/*
 * 20jy0209 
 * カン シチョウ
 */

import java.util.Scanner;

class Ex040{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int m,n;
		int ans;
		System.out.print("割られる数を入力：");
		m = scan.nextInt();
		System.out.print("割る数を入力：");
		n = scan.nextInt();
		
		ans = divide(m,n);
		System.out.println("商："+ans);
	}
	
	public static int divide(int dividend,int divisor){
		int quotient;
		quotient = dividend/divisor;
		return quotient ;
	}
}
