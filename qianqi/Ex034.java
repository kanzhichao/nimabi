/*
 * 20jy0209 
 * �J�� �V�`���E
 */

class Ex034{
	public static void main(String[] args){
		int[] ten = {40,50,80,60,90,40};
		int max = 0;
		for(int i=0;i<ten.length;i++){
			if(max<ten[i]){
				max = ten[i];
			}
		}
		System.out.println("�ő�:"+max+"�_");
	}
}
