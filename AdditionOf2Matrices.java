import java.util.Scanner;

class AdditionOf2Matrices{
	
	public static void main(String args[]){

int n,m,i,j;

Scanner sc=new Scanner(System.in);

System.out.println("Enter the no.of rows:");
n=sc.nextInt();

System.out.println("Enter the no.of columns:");
m=sc.nextInt();

int a[][]=new int[n][m];
System.out.println("Enter elements into matrix 1:");
for(i=0;i<n;i++){
	for(j=0;j<n;j++){
		System.out.println("num"+(i+1)+"=");
		a[i][j]=sc.nextInt();
	}
}

int b[][]=new int[n][m];

System.out.println("Enter elements into matrix 2:");
for(i=0;i<n;i++){
	for(j=0;j<m;j++){
		System.out.println("num"+(i+1)+"=");
		b[i][j]=sc.nextInt();
	}
}

int c[][]=new int[n][m];
System.out.println("Added matrix:");
for(i=0;i<n;i++){
	for(j=0;j<m;j++){
		c[i][j]=a[i][j]+b[i][j];
		System.out.println(c[i][j]);
	}
}
	}
}