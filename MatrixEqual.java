//2 matrices equal or not

import java.util.Scanner;

class MatrixEqual{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int r1,c1,i,j,r2,c2;
		
		System.out.println("Enter the no.of rows:");
		r1=sc.nextInt();
		
		System.out.println("Enter the no.of columns:");
		c1=sc.nextInt();
		
		System.out.println("Enter elements into matrix1:");
		
		int a[][]=new int[r1][c1];
		for(i=0;i<r1;i++){
			for(j=0;j<c1;j++){
				System.out.println("Num=");
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the no.of rows:");
		r2=sc.nextInt();
		
		System.out.println("Enter the no.of columns:");
		c2=sc.nextInt();
		
		int b[][]=new int[r2][c2];
		
		System.out.println("Enter elements into matrix2:");
		
		for(i=0;i<r2;i++){
			for(j=0;j<c2;j++){
				System.out.println("Num=");
				b[i][j]=sc.nextInt();
			}
		}
		
		if(r1==r2 && c1==c2){
			
			for(i=0;i<r1;i++){
				for(j=0;j<c1;j++){
					if(a[i][j]==b[i][j]){
						System.out.println("Equal matrices");
					}
				}
			}
		}
			else{
				System.out.println("Unequal matrices");
			}
		}
	}

	
				
