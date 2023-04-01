import java.util.Scanner;

class Factorial{
	public static void main(String args[]){
		Scanner obj=new Scanner(System.in);
		int num,fact=1,i,n;
		System.out.println("Enter the number:");
		num=obj.nextInt();
		
		System.out.println("Factorial:");
		
		for(i=1;i<=num;i++){
			fact=fact*i;
		}
		System.out.println(fact);
	}
}
			
		