class DispArray {
	public static void main(String[] args) {
		int[] data = {10,20,30,40,50};
		
		dispData(data);
	}
	
	public static void dispData(int[] data){
		for(int dt:data){
			System.out.print(dt+" ");
		}
	}
}