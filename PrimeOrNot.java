import java.util.Scanner;

class PrimeOrNot{
	public static void main(String args[]){
		int num,i,count=0;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the number:");
		num=obj.nextInt();
		
		for(i=1;i<=num;i++){
			if(num%i==0){
				count++;
			}
		}
		if(count>2){
			System.out.println("Composite number");
		}
		else if(count==2){
			System.out.println("Prime number");
		}
		else{
			System.out.println("Neither prime nor composite");
	}
	}
}
			