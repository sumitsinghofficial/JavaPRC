package si.sumitsingh.javaprc.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableExample {
	public static void main(String[] args) {
		
		ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
		
		
		Runnable  task = ()->{
			
			
			try {
				
				System.out.println("Runnable task is running...");
				Thread.sleep(10000);
				System.out.println("Runnable Task completed");
				
			} catch (InterruptedException e) {
				
				Thread.currentThread().interrupt();
				// Cannot return a value here
	            // Cannot throw checked exceptions directly without a try-catch block
			}
		};
		
		// Executing the task
		newSingleThreadExecutor.execute(task);
		
		
		newSingleThreadExecutor.shutdown();
	}

}
