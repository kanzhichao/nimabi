/*
 * 20jy0209 
 * �J�� �V�`���E
 */
 
import java.util.Scanner;

class Ex011{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�����l=>");
		int num = scan.nextInt();
		
		if (num < 0){
			num = num * (-1);
		}
		System.out.println("��Βl=>" + num);
	}
}