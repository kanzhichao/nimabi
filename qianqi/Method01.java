import java.util.Scanner;

public class Method01 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Š‹à‡‘=>");
		int money = scan.nextInt();
		int kingaku = money2bai(money);
		System.out.println("‹àŠzF"+kingaku);
	}
	
	public static int money2bai(int kin){
		kin *= 2;
		return kin;
	}
}
