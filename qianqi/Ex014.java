/*
 * 20jy0209 
 * �J�� �V�`���E
 */
 
import java.util.Scanner;

class Ex014{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���_����͂��Ă�������:");
		int score = scan.nextInt();
		
		if(score>=0){
			if(score<=100){
				System.out.println("�������_��");
			}else{
				System.out.println("�s���ȓ_��");
			}
		}else{
			System.out.println("�s���ȓ_��");
		}
	}
}
