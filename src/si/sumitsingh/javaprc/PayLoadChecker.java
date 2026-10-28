package si.sumitsingh.javaprc;

import java.time.Instant;

public class PayLoadChecker {
	
	
	public String checkPayload(Object payLoad) {
		
		Instant start=Instant.now();
		
		// Simulate extracting a status field from the JPA entity/DTO
		String status = extractStatus(payLoad);
		
		String result;
		
		switch (status.toUpperCase())
		{
		case "SUCCESS" :
			result = handleSuccess(payLoad);
			break;
			
		case "Failed" :
			result = handleFailure(payLoad);
			break;
			
		default:
				result = "Unknown status : "+ status;
		}
				
		// Ensure execution time is within 20 seconds
        long elapsed = Instant.now().getEpochSecond() - start.getEpochSecond();
        if (elapsed > 20) {
            return "Status check exceeded 20 seconds";
        }	
				
				
		return result;
	}

	private String handleFailure(Object payLoad) {
		
		return null;
	}

	private String handleSuccess(Object payLoad) {
		
		return null;
	}

	private String extractStatus(Object payLoad) {
		
		return null;
	}
	
	
	
	

}
