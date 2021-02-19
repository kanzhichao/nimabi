class TestScope {
	public static void main(String[] args) {
		int a = 10;
		
		System.out.println("main  a:" + a);
		set(a);
		System.out.println("main  a:" + a);
	}
	
	public static void set(int a) {
		System.out.println("set  a:" + a);
		a = 999;
		System.out.println("set  a:" + a);
	}
}
