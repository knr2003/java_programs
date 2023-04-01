class Tg extends Thread{
	public void run(){
		
		//Thread t=currentThread();
		
		for(int i=0;i<=5;i++){
			
			
			System.out.println(i);
		}
		
		for(int i=0;i<=5;i++){
			try{
				//t.sleep(1000);
				Thread.sleep(1000);
			}
			catch(Exception e){
			}
			System.out.println("Ashrith");
		}
	}
}


class Th extends Thread{
	public void run(){
		
		Thread t=currentThread();
		System.out.println("Thread status:"+t.isAlive());
		for(int i=0;i<=5;i++){
			
			
			System.out.println(i);
		}
		
		for(int i=0;i<=5;i++){
			try{
				//t.sleep(1000);
				Thread.sleep(1000);
			}
			catch(Exception e){
			}
			System.out.println("Nihanth");
		}
	}
}
class TMethods{
	public static void main(String args[]){
		Th t1=new Th();
		Tg t2=new Tg();
		System.out.println("ID="+t1.getId());
		System.out.println("Name of thread is:"+t1.getName());
		t1.setName("Nihanth");
		System.out.println("Name of thread after setting with new name is:"+t1.getName());
		System.out.println("Priority of thread is:"+t1.getPriority());
		t1.setPriority(2);
		System.out.println("new Priority of thread after setting is:"+t1.getPriority());
		t1.start();
		try{
			t1.join();
		}
		catch(Exception e){
		}
		t2.start();
	}
}

//before using join 2 threads runned parallely,after including join the run is one after other.
