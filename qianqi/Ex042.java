/*
 * 20jy0209 
 * �J�� �V�`���E
 */

import java.util.Scanner;

public class Ex042{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("����\�����܂����F");
		int n = scan.nextInt();
		repeatHello(n);
	}
	 
	public static void repeatHello(int times){
		for(int i=0;i<times;i++){
			System.out.println("Hello!");
		}
	}
}
