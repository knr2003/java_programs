import java.util.Scanner;

class SumOfIndividualDigits{
	public static void main(String args[]){
		Scanner obj=new Scanner(System.in);
		int num,rem=0,rev=0;
		System.out.println("Enter the number:");
		num=obj.nextInt();
		
		while(num!=0){
			rem=num%10;
			rev=rev+rem;
			num=num/10;
		}
		System.out.println("Sum of the digits="+rev);
	}
}
			