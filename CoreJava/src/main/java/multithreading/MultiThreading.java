package multithreading;

class sum extends MultiThreading implements Runnable{
	int avg=sum/5;
	
}
public class MultiThreading extends Thread {
	static int a[]={1,2,3,4,5};
	
	static int sum=0;
    public static void main(String [] args) throws InterruptedException
    {
    	for(int i=0;i<5;i++){
    		sum +=a[i];
    		
    		System.out.println(sum);
    	}
    	
    			Thread mt1=new Thread(new sum());
    }


}
