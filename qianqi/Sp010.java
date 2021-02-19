/*
 * 20jy0209 
 * カン シチョウ
 */

import java.util.Scanner;

class Sp010{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int data[] = new int[100];
		int i=0;
		int m;
		do{
			m =scan.nextInt();
			data[i]=m;
			i=i+1;
		}while(m!=-1);
		
		int rank[]=new int[i];
		int value=1;
		int k;
		int n;
		
		
		for(k=0;k<i-1;k++){
			for(n=k+1;n<i;n++){
				if(data[k]<data[n]){
					value=k+1;
				}
				rank[k]=value;
			}
		}
				
		
		for(int j=0;j<i;j++){
			System.out.println(data[j]);
			System.out.print(rank[j-1]);
		}
	}
}
