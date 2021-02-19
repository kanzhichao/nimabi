/*
 * 20jy0209 
 * カン シチョウ
 */
 
import java.util.Scanner;

class Ex011{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("整数値=>");
		int num = scan.nextInt();
		
		if (num < 0){
			num = num * (-1);
		}
		System.out.println("絶対値=>" + num);
	}
}