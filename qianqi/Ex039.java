/*
 * 20jy0209 
 * �J�� �V�`���E
 */

import java.util.Scanner;

class Ex039{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int[] data = {4,8,11,15,21};
		int i,num;
		System.out.print("��������͂��Ă��������F");
		num = scan.nextInt();		
		for(i=0;i<data.length && data[i] != num;i++){
		
		}

		if(i != data.length){
			System.out.println("�����l�͔z��̓Y��"+i+"�ɂ���܂�");
		}else{
			System.out.println("�����l�͂���܂���");
		}
	}
}
