/* and */

import java.util.Scanner;

class If04{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Œ±“_”=>");
		int test = scan.nextInt();
		System.out.print("‰Û‘è“_”=>");
		int exercise = scan.nextInt();
		
		if(test>=60 && exercise>=80){
			System.out.println("‡Ši");
		} else {
			System.out.println("•s‡Ši");
		}
	}
}
