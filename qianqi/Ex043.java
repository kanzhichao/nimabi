/*
 * 20jy0209 
 * カン シチョウ
 */

import java.util.Scanner;

public class Ex043 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("１つ目の値を入力：");
		int num1 = scan.nextInt();
		System.out.print("２つ目の値を入力：");
		int num2 = scan.nextInt();
		int result = large(num1,num2);
		
		if(result==0){
			System.out.println("等しい");
		}else{
			System.out.println("大きいの値は"+result);
		}
	}
	public static int large(int n1,int n2){
		int big;
		int equal;
		if(n1>n2){
			big=n1;
			return big;
		}else if(n2>n1){
			big=n2;
			return big;
		}else{
			return 0;
		}
	}
}
