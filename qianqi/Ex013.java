/*
 * 20jy0209 
 * カン シチョウ
 */
 
import java.util.Scanner;

class Ex013{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("年齢を入力してください:");
		int age = scan.nextInt();
		int price;
		
		if(age>=18){
			price = 6900;
		}else if(age>=12){
			price = 6000;
		}else if(age>=4){
			price = 4500;
		}else{
			price = 0;
		}
		System.out.print(age+"オの価格は"+price+"円です。");
	}
}
