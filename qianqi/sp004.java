/*
 * 20jy0209 
 * カン シチョウ
 */

import java.util.Scanner;

class sp004{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("月を入力してください:");
		int month = scan.nextInt();
		
		if(month < 1 || month >12){
			System.out.println("誤った月");
		} else {
			System.out.println("正しい月");
		}
	}
}
