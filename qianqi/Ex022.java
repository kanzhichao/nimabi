/*
 * 20jy0209 
 * �J�� �V�`���E
 */
 
import java.util.Scanner;

class Ex022{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("�h���H");
		double dollar = scan.nextDouble();
		System.out.println("���|�g�F�~");
		
		for (double i = 100;i <= 110;i += 0.5){
			System.out.println(i+":"+i * dollar+"�~");
		}
	}
}
