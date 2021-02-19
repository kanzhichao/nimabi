class For01{
	public static void main(String[] args){
		int i;
		for(i=1;i<=10;i++){
			System.out.println(i + ":カン");
		}
		System.out.println();
		
		for(i=10;i>=1;i--){
			System.out.println(i + ":カン");
		}
		System.out.println();
		
		for(i=1;i<=10;i=i+2){
			System.out.println(i + ":カン");
		}
		System.out.println();
		
		double k;
		for(k=1;k<2.0;k=k+0.1){
			System.out.println(k + ":カン");
		}
	}
}