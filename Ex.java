class Ex{
	void display(){
		try{
			int a=5/0;
		}
		catch (ArithmeticException e){
			System.out.prinln(e);
		}
	}
}
class Except{
	public static void main(String args[]){
		Ex Obj =new Ex();
		obj.display();
	}
}

			
			