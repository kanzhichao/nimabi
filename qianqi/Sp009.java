/*
 * 20jy0209 
 * ƒJƒ“ ƒVƒ`ƒ‡ƒE
 */

import java.util.Scanner;

class Sp009{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int money[] = {10000,5000,2000,1000,500,100,50,10,5,1};
		int number[] = new int[10];
		System.out.print("‹àŠz“ü—ÍH");
		int k = scan.nextInt();
		for(int i=0;i < money.length;i++){
			if(k > money[i]){
				number[i] = k/money[i];
				k=k%(number[i]*money[i]);
			}
		}
		for(int j=0;j<number.length;j++){
			if(money[j]==10000){
				System.out.println(money[j]+"‰~F "+number[j]);
			}else if(money[j]>=1000){
				System.out.println(" "+money[j]+"‰~F "+number[j]);
			}else if(money[j]>=100){
				System.out.println("  "+money[j]+"‰~F "+number[j]);
			}else if(money[j]>=10){
				System.out.println("   "+money[j]+"‰~F "+number[j]);
			}else{
				System.out.println("    "+money[j]+"‰~F "+number[j]);
			}
		}
	}
}
