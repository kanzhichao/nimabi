/*
 * 20jy0209 
 * カン シチョウ
 */
 
import java.util.Scanner;

class Ex014{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("得点を入力してください:");
		int score = scan.nextInt();
		
		if(score>=0){
			if(score<=100){
				System.out.println("正しい点数");
			}else{
				System.out.println("不正な点数");
			}
		}else{
			System.out.println("不正な点数");
		}
	}
}
