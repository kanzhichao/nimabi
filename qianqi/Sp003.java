/*
 * 20jy0209 
 * �J�� �V�`���E
 */
 
import java.util.Scanner;

class Sp003{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�w�����z��?:");
		int purchase = scan.nextInt();
		int payment = purchase;
		
		if( purchase>=10000 ){
			payment *= 0.9; // payment = payment * 0.9 �� ���s�ł��Ȃ�
		}
		System.out.println("�x�����z��?:" + payment);
	}
}