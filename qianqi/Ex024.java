/*
 * 20jy0209 
 * �J�� �V�`���E
 */

import java.util.Scanner;
 
class Ex024{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("1����n�܂ł̐����̍��v���v�Z���܂��B");
		System.out.print("input n:");
		int n = scan.nextInt();
		int sum = 0;
		
		for(int i = 1;i <= n;i++){
			sum += i;
		}
		System.out.println("���v:"+sum);
	}
}
