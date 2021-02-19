/*
 * 20jy0209 
 * カン シチョウ
 */

import java.util.Scanner;
 
class Ex024{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("1からnまでの整数の合計を計算します。");
		System.out.print("input n:");
		int n = scan.nextInt();
		int sum = 0;
		
		for(int i = 1;i <= n;i++){
			sum += i;
		}
		System.out.println("合計:"+sum);
	}
}
