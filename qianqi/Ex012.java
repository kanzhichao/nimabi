/*
 * 20jy0209 
 * カン シチョウ
 */
import java.util.Scanner;

class Ex012{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("aを入力:");
		int a = scan.nextInt();
		System.out.print("bを入力:");
		int b = scan.nextInt();
		
		int sum = a + b;
		int dist = a - b;
		int times = a * b;
		
		System.out.println("和:" + sum);
		System.out.println("差:" + dist);
		System.out.println("積:" + times);
		
		if (b != 0){
			int div = a / b;
		    int mod = a % b;
			System.out.println("商:" + div);
			System.out.println("余り:" + mod);
		}else{
			System.out.println("商:" + "0で割ることはできません");
			System.out.println("余り:" + "0で割ることはできません");
		}
	}
}