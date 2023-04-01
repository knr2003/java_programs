import java.util.*;
class Single implements Runnable{
	public void run(){
		for(int i=0;i<5;i++){
			System.out.println(i);
		}
	}
}
class SingleThreadInterface{
	public static void main(String args[]){
		Single s=new Single();
		Thread t=new Thread(s);
		t.start();
	}
}
