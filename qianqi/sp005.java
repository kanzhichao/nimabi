/*
 * 20jy0209 
 * カン シチョウ
 */

import java.util.Scanner;

class sp005{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("走行距離を入力してください:");
		
		int distance = scan.nextInt();
		int price = 0;
		int times = 1+(distance - 2000)/288;
		
		if(distance <= 2000){
			price = 710;
		} else if((distance-2000)%288 == 0){
			price = 710 + 90 * (distance - 2000)/288;
		} else {
			price = 710 + 90 * times;
		}
		System.out.println("料金は"+price+"円です。");
	}
}
