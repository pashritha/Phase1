
public class MyRunnableThread implements Runnable {
	 public static int myCount = 0;
	    public MyRunnableThread(){

	    }
	    public void run() {
	while(MyRunnableThread.myCount<= 10){
	try{
	System.out.println("Expl Thread: "+(++MyRunnableThread.myCount));
	Thread.sleep(100);
	            } 
	catch (InterruptedExceptioniex) {
	System.out.println("Exception in thread: "+iex.getMessage());
	            }
	        }
	    } 
	    public static void main(String a[]){
	System.out.println("Starting Main Thread...");
	MyRunnableThreadmrt = new MyRunnableThread();
	        Thread t = new Thread(mrt);
	t.start();
	while(MyRunnableThread.myCount<= 10){
	try{
	System.out.println("Main Thread: "+(++MyRunnableThread.myCount));
	Thread.sleep(100);
	            } catch (InterruptedExceptioniex){
	System.out.println("Exception in main thread: "+iex.getMessage());
	            }
	        }
	System.out.println("End of Main Thread...");
	    }
	}



