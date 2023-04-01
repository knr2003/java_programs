import java.util.Scanner;
class Num10AS{
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		
		int n,sum=0,Avg=0;
		//int a[]=new int[n];
		int i;
		
		System.out.println("Enter the n value:");
		n=sc.nextInt();
		
		int a[]=new int[n];
		
		System.out.println("Enter the numbers:");
		for(i=0;i<n;i++){
			System.out.println("Enter num"+(i)+"=");
			a[i]=sc.nextInt();
		}
		
		System.out.println("Display the numbers:");
		
		for(i=0;i<n;i++){
			System.out.println(a[i]);
		}
		
		for(i=0;i<n;i++){
			sum=sum+a[i];
		}
		
		Avg=sum/n;
		
		System.out.println("Sum="+sum);
		System.out.println("Average="+Avg);
	}
}
			
			
		
		