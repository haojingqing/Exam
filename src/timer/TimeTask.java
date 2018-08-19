package timer;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class TimeTask {

	public static void main(String[] args) {
		
		timerExecutor();
	}
	
	public static void task() {
		  Timer timer = new Timer();
		  CrontTimer crontTimer = new CrontTimer();
		  timer.schedule(crontTimer, 0,10);
	}
	
	public static void timerExecutor() {
		   ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(5);
	       newScheduledThreadPool.scheduleAtFixedRate(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("run exec");
				
			}
		}, 1, 1, TimeUnit.SECONDS);

}

}
class CrontTimer extends TimerTask{

	@Override
	public void run() {
      System.out.println("run");			
	}
	
}
