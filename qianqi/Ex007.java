/*
 * 20jy0209 
 * カン シチョウ
 */

public class Ex007 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c;
		c = b;
		b = a;
		a = c;
		System.out.println("変数a:" + a);
		System.out.println("変数b:" + b);
	}
}