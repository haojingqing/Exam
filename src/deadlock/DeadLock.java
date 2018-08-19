package deadlock;


/*
 * 实现一个死锁
 * */

public class DeadLock {

	public static String obj1="obj1";
	public static String obj2="obj2";
	
	public static void main(String[] args) {
		    Thread thread1= new Thread(new Lock1());
		    Thread thread2= new Thread(new Lock2());
		    thread1.start();
		    thread2.start();
	}
}
class Lock1 implements Runnable{

	public void run() {
	   while(true) {
		   synchronized (DeadLock.obj1) {
			   try {
				   System.out.println("Lock1 lock obj1");
				Thread.sleep(3000);
				synchronized(DeadLock.obj2) {
					System.out.println("Lock1 lock obj2");
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	   }
	}
	
}

class Lock2 implements Runnable{

	public void run() {
		while(true) {
			synchronized(DeadLock.obj2) {
				System.out.println("Lock2 lock obj2");
				try {
					Thread.sleep(3000);
					synchronized(DeadLock.obj1) {
						System.out.println("Lock2 lock obj1");
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
}
