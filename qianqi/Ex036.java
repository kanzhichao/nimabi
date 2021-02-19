

import java.util.Scanner;

class Ex036{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int[] monthdays = {31,28,31,30,31,30,31,31,30,31,30,31};
		int m;
		do{
			System.out.print("月を入力：");
			m =scan.nextInt();
			if(m<1 || m>12){
			
			}else{
				System.out.println(m+"月："+monthdays[m-1]);
			}
		}while(m<=12 && m>=1);
		System.out.println("終了");
	}
}
