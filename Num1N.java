import java.util.Scanner;
class Num1N{
	public static void main(String args[]){
		Scanner obj=new Scanner(System.in);
		int n,i;
		System.out.println("Enter the n:");
		n=obj.nextInt();
		System.out.println("Numbers:");
		for(i=1;i<=n;i++){
			System.out.println(i);
		}
	}
}