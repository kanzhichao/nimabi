/*
 * 20jy0209 
 * �J�� �V�`���E
 */

import java.util.Scanner;

public class Ex043 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("�P�ڂ̒l����́F");
		int num1 = scan.nextInt();
		System.out.print("�Q�ڂ̒l����́F");
		int num2 = scan.nextInt();
		int result = large(num1,num2);
		
		if(result==0){
			System.out.println("������");
		}else{
			System.out.println("�傫���̒l��"+result);
		}
	}
	public static int large(int n1,int n2){
		int big;
		int equal;
		if(n1>n2){
			big=n1;
			return big;
		}else if(n2>n1){
			big=n2;
			return big;
		}else{
			return 0;
		}
	}
}
