/*
 * 20jy0209 
 * カン シチョウ
 */

import java.util.Scanner;

class Sp008{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("正方形の１辺（*の個数）？");
		int n = scan.nextInt();
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(i==0 || i==n-1){
					System.out.print("*");
				}else if(j==0 || j==n-1){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}