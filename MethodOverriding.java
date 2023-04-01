class A{
	void display(){
		System.out.println("1st display");
	}
}
class B extends A{
	void display(){
		super.display();
		System.out.println("2nd display");
	}
}

class MethodOverriding{
	public static void main(String args[]){
		B obj=new B();
		obj.display();
	}
}