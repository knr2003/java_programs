import java.util.*;

class Single extends Thread{
	public void run(){
		for(int i=0;i<5;i++){
			System.out.println(i);
		}
	}
}
class SingleThread{
	public static void main(String args[]){
		Single t=new Single();
		t.start();
	}
}

		