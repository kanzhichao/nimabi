/*
 * 20jy0209 
 * �J�� �V�`���E
 */

import java.util.Scanner;

class Ex038{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int[] data = {4,8,11,15,21};
		int j = 0;
		int k = 0;
		int num;
		System.out.print("��������͂��Ă��������F");
		num = scan.nextInt();
		for(int i=0;i<data.length;i++){
			if(data[i] == num){
				k = data[i];
				j = i;
				break;
			}
		}
		if(k == num){
			System.out.println("�����l�͔z��̓Y��"+j+"�ɂ���܂�");
		}else{
			System.out.println("�����l�͂���܂���");
		}
	}
}
