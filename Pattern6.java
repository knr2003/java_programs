import java.util.Scanner;
class Pattern6{
	public static void main(String args[]){
		Scanner obj=new Scanner(System.in);
		int row,col,n,space,k;
		System.out.println("Enter the no.of lines:");
		n=obj.nextInt();
		space=n-1;
		for(row=1;row<=n;row++){
			for(k=space;k>0;k--){
				System.out.print(" ");
			}
			space--;
			for(col=1;col<=row;col++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
				
			
		
		
	
	
