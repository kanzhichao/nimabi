
class Ex030{
	public static void main(String[] args){
		for(int i=1;i<=9;i++){
			for(int j=1;j<=9;j++){
				int n=i*j;
				if(n<10){
				    System.out.print("  "+n);
				}else{
					System.out.print(" "+n);
				}
			}
			System.out.println();
		}
	}
}
