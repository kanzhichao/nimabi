import java.util.Scanner;

public class Method04 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("値１=>");
		int num1 = scan.nextInt();
		System.out.print("値２=>");
		int num2 = scan.nextInt();
		int result = chkValue(num1,num2);
		if(result==1){
			System.out.println("等しい");
		}else{
			System.out.println("等しくない");
		}
	}
	
	public static int chkValue(int n1,int n2){
		if(n1==n2){
			return 1;
		}else{
			return 0;
		}
	}
}
