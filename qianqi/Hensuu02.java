/*
     ����������Z�q
�@�@�C���N�������g�E�f�N�������g
*/

public class Hensuu02 {
	public static void main(String args[]){
		int a = 100;
		a = a + 10;
		System.out.println("a:" + a);
		
		a *= 2;
		System.out.println("a:" + a);
		
		
		int b;
		a = 10;
		b = ++a;   //�O�u��
		System.out.println("a:"+ a +" b:" + b);
		
		a = 10;
		b = a++;  //��u��
		System.out.println("a:"+ a +" b:" + b);
		
		a = 10;
		a++;     //++a�Ɠ���
		System.out.println("a:" + a);
		
	}
}