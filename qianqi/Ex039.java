/*
 * 20jy0209 
 * カン シチョウ
 */

import java.util.Scanner;

class Ex039{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int[] data = {4,8,11,15,21};
		int i,num;
		System.out.print("数字を入力してください：");
		num = scan.nextInt();		
		for(i=0;i<data.length && data[i] != num;i++){
		
		}

		if(i != data.length){
			System.out.println("同じ値は配列の添字"+i+"にあります");
		}else{
			System.out.println("同じ値はありません");
		}
	}
}
