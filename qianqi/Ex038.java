/*
 * 20jy0209 
 * カン シチョウ
 */

import java.util.Scanner;

class Ex038{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int[] data = {4,8,11,15,21};
		int j = 0;
		int k = 0;
		int num;
		System.out.print("数字を入力してください：");
		num = scan.nextInt();
		for(int i=0;i<data.length;i++){
			if(data[i] == num){
				k = data[i];
				j = i;
				break;
			}
		}
		if(k == num){
			System.out.println("同じ値は配列の添字"+j+"にあります");
		}else{
			System.out.println("同じ値はありません");
		}
	}
}
