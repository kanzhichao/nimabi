/*
 * 20jy0209 
 * �J�� �V�`���E
 */

import java.util.Scanner;

class sp004{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("������͂��Ă�������:");
		int month = scan.nextInt();
		
		if(month < 1 || month >12){
			System.out.println("�������");
		} else {
			System.out.println("��������");
		}
	}
}
