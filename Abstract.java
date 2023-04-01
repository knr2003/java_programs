abstract class A{
	abstract void display();
}

abstract class B extends A{
	void display(){
		System.out.println("abstract class 1");
	}
	abstract void show();
}

class C extends B{
	
	void show(){
		System.out.println("abstract class 2");
	}
}

	
class Abstract{
	
	int x=10;
	
	public static void main(String args[]){
		Abstract Ab=new Abstract();
		System.out.println("x="+Ab.x);
		C obj= new C();
		obj.display();
		obj.show();
	}
}
