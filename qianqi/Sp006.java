/*
 * 20jy0209 
 * �J�� �V�`���E
 */

import java.util.Scanner;
 
class Sp006{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int ran = (int)(Math.random() * 10) + 1;
		int n;
		System.out.println("�����𓖂Ă܂��B1�`10�̒l����͂��Ă�������");
		do{
			System.out.print("�l�H");
		    n = scan.nextInt();
			if(n==0 || ran==n){
				break;
			}
			System.out.println("�͂���I");
		}while(ran != n);
			if(n==0){
				System.out.println("�I��");
			}else if(n==ran){
				System.out.println("������I�I");
			}
	}
}
