package si.sumitsingh.javaprc.multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExample {
	public static void main(String[] args) {
		ExecutorService executor = Executors.newSingleThreadExecutor();
		
		
		
		Callable<Integer> task = () ->{
			
			System.out.println("Callable task is calculating...");
			Thread.sleep(null);    // Notice: call() can throw checked exceptions (like InterruptedException) natively
            
            
			
			return 42; // Returns a result
		};
		
		
		// Submitting the task returns a Future object immediately
        Future<Integer> future = executor.submit(task);
		
        System.out.println("Main thread is doing other work...");
		
	
        try {
			Integer result  = future.get();
			
			System.out.println("Result from Callable: " + result);
			
			
			
		} catch (InterruptedException e) {
			System.err.println("Task failed with exception: " + e.getMessage());
			
		} catch (ExecutionException e) {
			
			e.printStackTrace();
		}finally {
			executor.shutdown();
		}
        
        
        
        
        CompletableFuture.supplyAsync(() -> {
            // Simulating remote API call
            return "Raw Web Data";
        })
        .thenApply(data -> data + " -> Processed") // Transforms the data reactively
        .thenAccept(finalResult -> System.out.println("Result: " + finalResult)) // Consumes result
        .exceptionally(ex -> {
            System.out.println("Error occurred: " + ex.getMessage());
            return null;
        }); 
        
//        CompletableFuture<Integer> sd= ()->{
//        	return 34;
//        };
        
	}

}
