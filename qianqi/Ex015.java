/*
 * 20jy0209 
 * �J�� �V�`���E
 */
 
import java.util.Scanner;

class Ex015{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("���_����͂��Ă�������:");
		int score = scan.nextInt();
		if( 0<=score && score<=100){
			System.out.println("�������_��");
		} else {
			System.out.println("�s���ȓ_��");
		}
	}
}
