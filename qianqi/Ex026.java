/*
 * 20jy0209 
 * カン シチョウ
 */

import java.util.Scanner;
 
class Ex026{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("1からnまでの奇数の合計を計算します。");
		int n;
		do{
		    System.out.println("1～100の値を入力してください。");
		    System.out.print("input n:");
		    n = scan.nextInt();
		}while(n < 1 || n > 100);
		int sum = 0;
		
		for(int i = 1;i <= n;i=i+2){
			sum += i;
		}
		System.out.println("合計:"+sum);
	}
}
