import java.util.Scanner;

class MaxMin{
	
	public static void main(String args[]){
	
	Scanner sc=new Scanner(System.in);
	
	int n,i,temp=0;
	
	System.out.println("Enter the n value:");
	n=sc.nextInt();
	
	int a[] = new int[n];
	
	System.out.println("Enter the numbers:");
	for(i=0;i<n;i++)
	{
		System.out.println("Enter num"+(i+1)+"=");
		a[i]=sc.nextInt();
	}
	
	int max=0;
	
	for(i=0;i<n;i++)
	{
		if(a[i]>=max)
		{
			max=a[i];
			//temp=max;
			
		}
	}
	System.out.println("max value:"+max);
	
	int min=0;
	
	for(i=0;i<n;i++)
	{
		if(a[i]<=min)
		{
			min=a[i];
		}
	}
	System.out.println("min value:"+min);
	
	double Avg=0,tot=0;
	
	Avg=max+min;
	tot=Avg/2;
	System.out.println("Average of max and min values:"+tot);
}
}


    

	
	

    	
	
	