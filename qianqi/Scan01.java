/*キーボード入力*/
import java.util.Scanner;

class Scan01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int value;
		System.out.print("value=>");
		value = scan.nextInt();
		System.out.println("value:" + value);
		
		System.out.print("半径=>");
		double r = scan.nextDouble();
		double s = r * r * 3.14;
		System.out.println("円の面積:" + s);
	}
}
