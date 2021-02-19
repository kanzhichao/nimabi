/* else~if*/

import java.util.Scanner;

class If05{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("“_”=>");
		int score = scan.nextInt();
		String rank;
		
		if(score>=80){
			rank = "A";
		}else if(score>=70){
			rank = "B";
		}else if(score>=60){
			rank = "C";
		}else{
			rank = "D";
		}
		System.out.println("•]‰¿:" + rank);
	}
}