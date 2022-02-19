public class MyThread extends Thread{
	public void run()
	{
		System.out.println("concurrent thread started running..");

	public static void main( Stringargs[] )
	{
		MyThread mt = new  MyThread();
		mt.start();
	}

	}


