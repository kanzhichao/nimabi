/*
 * 20jy0209 
 * カン シチョウ
 */

import java.util.Scanner;
 
class Ex021{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("数字を入力してください");
		int n = scan.nextInt();
		for(int i = 1;i <= n;i++){
			System.out.println(i);
		}
	}
}
