/*
 * 20jy0209 
 * �J�� �V�`���E
 */

class Ex033{
	public static void main(String[] args){
		int[] ten = {40,50,80,60,90,40};
		
		int sum = 0;
		for(int i=0;i<ten.length;i++){
			sum += ten[i];
		}
		
		int avg = 0;
		avg = sum/ten.length;
		
	    System.out.println("���v:"+sum+"�_");
		System.out.println("����:"+avg+"�_");
	}
}
