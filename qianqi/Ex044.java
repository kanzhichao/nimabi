/*
 * 20jy0209 
 * �J�� �V�`���E
 */

import java.util.Scanner;

public class Ex044{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double area;
		System.out.print("�O�p�`�̒�ӁF");
		double bottom = scan.nextDouble();
		System.out.print("�O�p�`�̍����F");
		double height = scan.nextDouble();
		area = findTriangle(bottom,height);
		
		if(area==-1){
			System.out.println("��ӂ܂��͍����Ɍ�肪����܂�");
		}else{
			System.out.println("�O�p�`�̖ʐρF"+area);
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
