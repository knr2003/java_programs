import java.util.Scanner;

class Palindrome{
	public static void main(String args[]){
		int num,rem=0,rev=0,temp=0;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the number:");
		num=obj.nextInt();
		temp=num;
		while(num!=0){
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		if(rev==temp){
			System.out.println("Palindrome");
		}
		else{
			System.out.println("Not palindrome");
		}
	}
}