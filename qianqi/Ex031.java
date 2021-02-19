/*
 * 20jy0209 
 * カン シチョウ
 */

class Ex031{
	public static void main(String[] args){
		int i;
		int[] a = {10,20,30,40,50};
		int[] b = new int[5];
		b[0] = 100;
		b[1] = 200;
		b[2] = 300;
		b[3] = 400;
		b[4] = 500;
		
		for(i=0;i<a.length;i++){
			System.out.println("a="+a[i]+" b="+b[i]);
		}
	}
}
