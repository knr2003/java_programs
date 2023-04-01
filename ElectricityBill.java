import java.util.Scanner;
class ElectricityBill{
	public static void main(String args[]){
		double un,ch;
	    double total=0;
		
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the no.of units:");
		un=obj.nextInt();
		if(un>=1 && un<=200){
			ch=un*0.8;
			total=ch+100;
		}
		else if(un>200 && un<=300){
			ch=un*0.9;
			total=ch+100;
		}
		else if(un>300){
			ch=un*1;
			total=ch+100;
		}
		else{
			System.out.println("Invalid charges");
		}
		
		if(total>400){
			System.out.println("Charges="+(total+total*0.15));
		}
		else{
			System.out.println("charges="+total);
		}
	}
}
		