class A{
	void display(){
		System.out.println("Display function");
	}
	void display(int a){
		System.out.println("a="+a);
	}
}
class MethodOverloading{
	public static void main(String args[]){
		A obj=new A();
		obj.display();
		obj.display(20);
	}
}
