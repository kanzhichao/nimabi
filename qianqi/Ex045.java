/*
 * 20jy0209 
 * カン シチョウ
 */

 
class Ex045 {
	public static void main(String[] args) {
		int[] data = {4,8,11,15,21};
		int total = totalArray(data);
		System.out.println("合計値："+total);
	}
	
	public static int totalArray(int[] data){
		int sum = 0;
		for(int i=0;i<data.length;i++){
			sum+=data[i];
		}
		return sum;
	}
}
