class Parent{
	void display(){
		System.out.println("Praveen");
	}
}
class Child1 extends Parent{
	void show(){
		System.out.println("Nihanth");
	}
}
class Child2 extends Parent{
	void see(){
		System.out.println("Ashrith");
	}
}
class Inherit{
	public static void main(String args[]){
		Child1 ch1=new Child1();
		ch1.display();
		ch1.show();
		
		Child2 ch2=new Child2();
		
		
		ch2.display();
		ch2.see();
	}
}
