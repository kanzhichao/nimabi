/*
 * 20jy0209 
 * �J�� �V�`���E
 */

import java.util.Scanner;

class sp005{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("���s��������͂��Ă�������:");
		
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
		System.out.println("������"+price+"�~�ł��B");
	}
}
