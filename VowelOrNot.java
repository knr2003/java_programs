import java.util.Scanner;

class VowelOrNot{
	
	public static void main(String args[]){

            char ch;
			Scanner obj=new Scanner(System.in);
			
            System.out.println("Enter the letter:");
			ch=obj.next().charAt(0);
			
			if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U'){
				System.out.println("vowel");
			}
			else{
				System.out.println("not vowel");
			}
}
}
