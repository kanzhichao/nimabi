/*
 * 20jy0209 
 * �J�� �V�`���E
 */
 
import java.util.Scanner;

class Ex029{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("�O�p�`�̒�Ӂi*�̌��j�H");
		int x = scan.nextInt();
		for(int i=0;i<x;i++){
			for(int j=0;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
