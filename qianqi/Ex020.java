/*
 * 20jy0209 
 * �J�� �V�`���E
 */
 
import java.util.Scanner;

class Ex020{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("*�̌��H");
		int kosuu = scan.nextInt();
		int i = 1;
		while(i <= kosuu){
			System.out.print("*");
			i = i + 1;
		}
	}
}