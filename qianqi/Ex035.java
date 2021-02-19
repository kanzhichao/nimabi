/*
 * 20jy0209 
 * カン シチョウ
 */

class Ex035{
	public static void main(String[] args){
		int[] monthdays = {31,28,31,30,31,30,31,31,30,31,30,31};
		for(int i = 1;i<monthdays.length;i++){
			System.out.println(i+"月   "+monthdays[i-1]+"日");
		}
	}
}
