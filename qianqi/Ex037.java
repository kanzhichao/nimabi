/*
 * 20jy0209 
 * �J�� �V�`���E
 */

import java.util.Scanner;

class Ex037{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int[] a = new int[6];
		int m;
		int sum=0;
		do{
			System.out.print("サイコロの目?");
			m =scan.nextInt();
			if(m>=1 && m<=6){
				a[m-1] +=1;
			}else{
				System.out.println("1~6の数字を入力してください");
			}
		}while(m!=-1);
		System.out.println("** 集計 **");
		for(int i=0;i<a.length;i++){
			System.out.println(i+1+"   "+a[i]+"回";
		}
		for(int j=0;j<a.length;j++){
			sum += a[j];
		}
		System.out.println("計  " + var4 + "回"));
	}
}

