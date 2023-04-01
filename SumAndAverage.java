import java.util.Scanner;
class SumAndAverage{
	public static void main(String args[]){
		Scanner obj=new Scanner(System.in);
		int sum=0,i,n;
		double Avg;
		System.out.println("Enter n:");
		n=obj.nextInt();
		for(i=1;i<=n;i++){
			sum=sum+i;
		}
		Avg=sum/n;
		System.out.println("Sum="+sum);
		System.out.println("Average="+Avg);
	}
}
