/*
 * 20jy0209 
 * �J�� �V�`���E
 */
import java.util.Scanner;

class Ex012{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("a�����:");
		int a = scan.nextInt();
		System.out.print("b�����:");
		int b = scan.nextInt();
		
		int sum = a + b;
		int dist = a - b;
		int times = a * b;
		
		System.out.println("�a:" + sum);
		System.out.println("��:" + dist);
		System.out.println("��:" + times);
		
		if (b != 0){
			int div = a / b;
		    int mod = a % b;
			System.out.println("��:" + div);
			System.out.println("�]��:" + mod);
		}else{
			System.out.println("��:" + "0�Ŋ��邱�Ƃ͂ł��܂���");
			System.out.println("�]��:" + "0�Ŋ��邱�Ƃ͂ł��܂���");
		}
	}
}