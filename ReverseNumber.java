import java.util.Scanner;
class ReverseNumber{
public static void main(String args[]){
	
Scanner obj=new Scanner(System.in);
int num,num2,num1=0,rem=0,rev=0,temp=0;
System.out.println("Enter the number:");
num=obj.nextInt();

while(num!=0){
	
	rem=num%10;
	rev=rev*10+rem;
	num=num/10;
	

}

System.out.println("Reverse number="+rev);
}
}


	