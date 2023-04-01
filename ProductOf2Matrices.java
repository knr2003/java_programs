//product 2 matrices

import java.util.Scanner;

class ProductOf2Matrices{
	public static void main(String args[]){
		int r1,c1,i,j,r2,c2,k,sum=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter no.of rows for matrix 1:");
		r1=sc.nextInt();
		
		System.out.println("Enter no.of columns for matrix 1:");
		c1=sc.nextInt();
		
		int a[][]=new int[r1][c1];
		System.out.println("Enter the elements in matrix 1:");
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c1;j++)
			{
				System.out.println("Num=");
				a[i][j]=sc.nextInt();
			}
		}
		
		
		System.out.println("Enter no.of rows for matrix 2:");
		r2=sc.nextInt();
		
		System.out.println("Enter no.of columns for matrix 2:");
		c2=sc.nextInt();
		
		if(c1!=r2){
			System.out.println("Product not possible");
		}
		
		else
		{
		
		int b[][]=new int[r2][c2];
		System.out.println("Enter the elements in matrix 2:");
		for(i=0;i<r2;i++)
		{
			for(j=0;j<c2;j++)
			{
				System.out.println("Num=");
				b[i][j]=sc.nextInt();
			}
		}
		
		int c[][]=new int[r1][c1];
		
		
			for(i=0;i<r1;i++)
			{
				for(j=0;j<c2;j++)
				{
					for(k=0;k<r2;k++)
					{
						sum=sum+a[i][k]*b[k][j];
					}
					
				    c[i][j]=sum;
					sum=0;
				}
			}
		
		
		System.out.println("Product of 2 matrices:");
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c2;j++)
			{
				
				System.out.println(c[i][j]);
			}
		}
		
		
	}
}
}
				
			
				
						
		
		
		

		
		