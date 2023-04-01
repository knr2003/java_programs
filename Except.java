






class Ex{
	void display(){
		try
		{
			String str="hello";
			int num=Integer.parseInt(str);
			
		}
		catch(NumberFormatException e)
		{
			
			System.out.println(e);
			
		}
		
		System.out.println("Exception Handled..");
	}
}
class Except{
	public static void main(String arg[]){
		Ex obj =new Ex();
		obj.display();
	}
}

/*class Ex{
	void display(){
		
		
		try
		{
			String str=null;
			System.out.println(str.length());
			
		}
		catch(NullPointerException e)
		{
			
			System.out.println(e);
			
		}
		
		System.out.println("Exception Handled..");
	}
}
class Except{
	public static void main(String arg[]){
		Ex obj =new Ex();
		obj.display();
	}
}*/


/*class Ex{
	void display(){
		try
		{
			
			int b=5/0;
			int a[]=new int[5];
			a[6]=5;
			
		}
		catch(Exception e)
		{
			
			System.out.println(e);
			
		}
		
		System.out.println("Exception Handled..");
	}
}
class Except{
	public static void main(String arg[]){
		Ex obj =new Ex();
		obj.display();
	}
}*/

/*class Ex{
	void display(){
		try
		{
			
			
			int a[]=new int[5];
			a[6]=5;
			int b=5/0;
			
		}
		catch(Exception e)
		{
			
			System.out.println(e);
			
		}
		
		System.out.println("Exception Handled..");
	}
}
class Except{
	public static void main(String arg[]){
		Ex obj =new Ex();
		obj.display();
	}
}*/
			
			