class TestScopeArray {
	public static void main(String[] args) {
		int[] data = {10,20,30};
		
		dispData(data);
		set(data);
		dispData(data);
	}
	
	public static void set(int[] data) {
		data[1] = 999;
	}
	
	public static void dispData(int[] data) {
		for(int dt:data) {
			System.out.print(dt + "  ");
		}
		System.out.println();
	}
}
