/*
 * 20jy0209 
 * カン シチョウ
 */
 
import java.util.Scanner;

class Sp007{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("三角形の高さ（*の個数）？");
		int x = scan.nextInt();
		for(int i=1;i<=x;i++){
			for(int j=x;j>i;j--){
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++){
				System.out.print("*");
			}
			for(int m=1;m<i;m++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
