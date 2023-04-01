import java.util.Scanner;

class SumEvenA{
	
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		
		int n,i,sum=0;
		
		System.out.println("Enter the n value:");
		n=sc.nextInt();
		
		int a[]= new int[n];
		
		System.out.println("Enter the numbers:");
		for(i=0;i<n;i++)
		{
			System.out.println("Num"+(i+1)+"=");
			a[i]=sc.nextInt();
		}
		
		System.out.println("Even numbers sum=");
		
		for(i=0;i<n;i++)
		{
			if (a[i]%2==0)
			{
				sum+=a[i];
			}
		}
		System.out.println(sum);
	}
}
			