import java.util.Scanner;
class Power{
	public static void main(String args[]){
		Scanner obj=new Scanner(System.in);
		int num,num2,i,po=1;
		System.out.println("Enter the number:");
		num=obj.nextInt();
		System.out.println("Enter the power number:");
		num2=obj.nextInt();
		for(i=1;i<=num2;i++){
			po=po*num;
		}
		System.out.println("Power="+po);
	}
}