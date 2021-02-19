import java.util.Scanner;

public class Method04 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("’l‚P=>");
		int num1 = scan.nextInt();
		System.out.print("’l‚Q=>");
		int num2 = scan.nextInt();
		int result = chkValue(num1,num2);
		if(result==1){
			System.out.println("“™‚µ‚¢");
		}else{
			System.out.println("“™‚µ‚­‚È‚¢");
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
