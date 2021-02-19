import java.util.Scanner;

class Switch01 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("ÉhÉäÉìÉNî‘çÜ=>");
		int drink = scan.nextInt();
		int price;
		
		switch(drink){
			case 1:
			case 2:
			       price = 320;
			       break;
			case 3:
			case 4:
			       price = 250;
				   break;
		    default:
			       price = 0;
		}
		System.out.println("óøã‡ÅF"+price+"â~");
	}
}