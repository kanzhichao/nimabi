/*
 * 20jy0209 
 * �J�� �V�`���E
 */

import java.util.Scanner;
 
class Ex026{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("1����n�܂ł̊�̍��v���v�Z���܂��B");
		int n;
		do{
		    System.out.println("1�`100�̒l����͂��Ă��������B");
		    System.out.print("input n:");
		    n = scan.nextInt();
		}while(n < 1 || n > 100);
		int sum = 0;
		
		for(int i = 1;i <= n;i=i+2){
			sum += i;
		}
		System.out.println("���v:"+sum);
	}
}
