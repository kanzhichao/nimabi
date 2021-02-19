/*
 * 20jy0209 
 * ƒJƒ“ ƒVƒ`ƒ‡ƒE
 */
 
import java.util.Scanner;

class Sp003{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("w“ü‹àŠz‚Í?:");
		int purchase = scan.nextInt();
		int payment = purchase;
		
		if( purchase>=10000 ){
			payment *= 0.9; // payment = payment * 0.9 ‚Í Às‚Å‚«‚È‚¢
		}
		System.out.println("x•¥‹àŠz‚Í?:" + payment);
	}
}