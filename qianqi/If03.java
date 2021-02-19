/* ifのネスト */

import java.util.Scanner;

class If03{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("試験点数=>");
		int test = scan.nextInt();
		System.out.print("課題点数=>");
		int exercise = scan.nextInt();
		
		if(test>=60){
			if(exercise>=80){
				System.out.println("合格");
			} else {
				System.out.println("不合格");
			}
		} else {
			System.out.println("不合格");
		}
	}
}
