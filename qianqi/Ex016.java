/*
 * 20jy0209 
 * �J�� �V�`���E
 */
 
import java.util.Scanner;

class Ex016{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("������͂��Ă�������:");
		int month = scan.nextInt();
		
		if(month>=1){
			if(month<=12){
				System.out.println("��������");
			} else {
				System.out.println("�������");
			}
		} else {
			System.out.println("�������");
		}
	}
}
