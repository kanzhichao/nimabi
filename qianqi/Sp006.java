/*
 * 20jy0209 
 * カン シチョウ
 */

import java.util.Scanner;
 
class Sp006{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int ran = (int)(Math.random() * 10) + 1;
		int n;
		System.out.println("乱数を当てます。1～10の値を入力してください");
		do{
			System.out.print("値？");
		    n = scan.nextInt();
			if(n==0 || ran==n){
				break;
			}
			System.out.println("はずれ！");
		}while(ran != n);
			if(n==0){
				System.out.println("終了");
			}else if(n==ran){
				System.out.println("あたり！！");
			}
	}
}
