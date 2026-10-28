package si.sumitsingh.javaprc.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class ExcuterInterfaceDemo {
	public static void main(String[] args) {
		
		
		ExecutorService executor = Executors.newFixedThreadPool(5);
		
		for (int i = 1; i <= 5; i++) {
		    final int taskId = i;

		    executor.execute(() -> {
		        System.out.println(
		            "Task " + taskId + " executed by "
		            + Thread.currentThread().getName()
		        );
		    });
		}

		
		ThreadFactory defaultThreadFactory = Executors.defaultThreadFactory();
		defaultThreadFactory.newThread(()->{
			System.out.println("It is created");
		}).start();;
		
		
		
		
		
		executor.shutdown();
		
	}

}
