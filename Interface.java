interface A{
	void Adisplay();
}
interface B{
	void Bdisplay():
}
class C implements A,B{
	public void Adisplay(){
		System.out.println("A Display");
	}
	public void Bdisplay(){
		System.out.println("B Display");
	}
}
class Interface{
	public static void main(String args[]){
		
		C obj=new C();
		obj.Adisplay();
		obj.Bdisplay();
	}
}
		
		