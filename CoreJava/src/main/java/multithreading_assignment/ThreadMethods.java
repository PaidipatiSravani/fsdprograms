package multithreading_assignment;

class A implements Runnable{

	public void run() {
		for(int k=2;k<=5;k++){
			System.out.println("in runnable thread:"+k);
		}
		
	}
	
}
public class ThreadMethods extends Thread {

	public void run(){
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=1;i<=5;i++){
			System.out.println("in run method : "+i);
		}
	}
	public static void main(String[] args) throws InterruptedException {
		//System.out.println(Thread.currentThread().getName());
		//Thread.currentThread().setName("run");
		//System.out.println(Thread.currentThread().getName());
		
		                  //by extending thread class
		
		ThreadMethods t=new ThreadMethods();
		t.start();
		System.out.println(t.getPriority());
		t.setPriority(7);
		System.out.println(t.getPriority());
		
		               //by implementing runnable interface
		
		A a=new A();
		Thread t1=new Thread(a);
		t1.start();
		for(int j=6;j<=10;j++){
			System.out.println("in main method:"+j);
		}
		
		
	}

}
