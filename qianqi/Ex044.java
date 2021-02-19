/*
 * 20jy0209 
 * カン シチョウ
 */

import java.util.Scanner;

public class Ex044{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double area;
		System.out.print("三角形の底辺：");
		double bottom = scan.nextDouble();
		System.out.print("三角形の高さ：");
		double height = scan.nextDouble();
		area = findTriangle(bottom,height);
		
		if(area==-1){
			System.out.println("底辺または高さに誤りがあります");
		}else{
			System.out.println("三角形の面積："+area);
		}
	}
	public static double findTriangle(double n1,double n2){
		if(n1>0 && n2>0){
			double m = n1*n2/2;
			return m;
		}else{
			return -1;
		}
	}
}
