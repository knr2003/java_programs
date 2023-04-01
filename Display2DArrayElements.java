import java.util.Scanner;

class Display2DArrayElements{
	
	public static void main(String args[]){
		
		int n,m,i,j;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter no.of rows:");
		n=sc.nextInt();
		
		System.out.println("Enter the no.of columns:");
		m=sc.nextInt();
		
		int a[][]=new int[n][m];
		
		System.out.println("Enter elements into matrix:");
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				System.out.println("Num"+(i+1)+"=");
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Display the elements of matrix:");
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				System.out.println("Num"+(i+1)+"="+(a[i][j]));
			}
		}
	}
}
