/*
     複合代入演算子
　　インクリメント・デクリメント
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
		b = ++a;   //前置き
		System.out.println("a:"+ a +" b:" + b);
		
		a = 10;
		b = a++;  //後置き
		System.out.println("a:"+ a +" b:" + b);
		
		a = 10;
		a++;     //++aと同じ
		System.out.println("a:" + a);
		
	}
}