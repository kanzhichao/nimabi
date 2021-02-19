/*
 * 20jy0209 
 * カン シチョウ
 */
 
import java.util.Scanner;

class Ex022{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("ドル？");
		double dollar = scan.nextDouble();
		System.out.println("レ－ト：円");
		
		for (double i = 100;i <= 110;i += 0.5){
			System.out.println(i+":"+i * dollar+"円");
		}
	}
}
