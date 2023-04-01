import java.util.Scanner;

class Bonus{
public static void main(String args[]){

char s;
int sal,bon;
double bonus;

Scanner input=new Scanner(System.in);
System.out.println("Enter the gender:");
s=input.next().charAt(0);

if(s=='m'||s=='M'){
	System.out.println("Enter the salary:");
	sal=input.nextInt();
	System.out.println("Enter the bonus:");
	bon=input.nextInt();
	bonus=sal*bon/100;
	System.out.println("New Salary="+(sal+bonus));
}
else if(s=='f'||s=='F'){
	System.out.println("Enter the salary:");
	sal=input.nextInt();
	System.out.println("Enter the bonus:");
	bon=input.nextInt();
	bonus=sal*bon/100;
	System.out.println("New Salary="+(sal+bonus));
}else{
	System.out.println("Invalid Gender");
}
}
}

