class Parent{
	int a=40;
	void display(){
		System.out.println("Parent");
	}
}
class Child extends Parent{
	int a=10;
	void display(){
		System.out.println("Child");
		System.out.println(a);
		System.out.println(super.a);
		super.display();
	}
}
class ParentChild{
	public static void main(String args[]){
		Child ch=new Child();
		ch.display();
	}
}