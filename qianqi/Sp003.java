/*
 * 20jy0209 
 * カン シチョウ
 */
 
import java.util.Scanner;

class Sp003{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("購入金額は?:");
		int purchase = scan.nextInt();
		int payment = purchase;
		
		if( purchase>=10000 ){
			payment *= 0.9; // payment = payment * 0.9 は 実行できない
		}
		System.out.println("支払金額は?:" + payment);
	}
}