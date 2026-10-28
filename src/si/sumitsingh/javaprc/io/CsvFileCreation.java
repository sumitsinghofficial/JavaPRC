package si.sumitsingh.javaprc.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Random;
import java.util.stream.Collectors;

public class CsvFileCreation {
	
	private static final String CHAR_POOL = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    private static final Random RANDOM = new Random();

    public static String generateRandomString() {
        // 1. Generate a random length between 0 and 50 (inclusive)
        // nextInt(51) returns a number from 0 to 50
        int targetLength = RANDOM.nextInt(5); 
        
        // 2. Stream random character indices and map them to characters
        return RANDOM.ints(targetLength, 0, CHAR_POOL.length())
                .mapToObj(CHAR_POOL::charAt)
                .map(Object::toString)
                .collect(Collectors.joining());
    }
	
	public static void main(String[] args) throws IOException {
		
		FileWriter writer = new FileWriter("output1.txt");
		
		
		// Test it a few times
        for (int i = 0; i < 5; i++) {
            String randStr = generateRandomString();
            System.out.println("Length: " + randStr.length() + " -> \"" + randStr + "\"");
        }
		
        // 100000
		for (int i = 0; i < 1000000; i++) {
			
			StringBuffer sb=new StringBuffer();

			for (int j = 0; j < 10; j++) {
				String randStr = generateRandomString();
				
				sb.append(randStr);
				if(j!=100) {
					sb.append(",");
				}
				
			}
			
			writer.write(sb.toString());
			writer.write("\n");
			
			//System.out.println(sb.toString());
			
			sb.setLength(0);
		}
		
		
		
		HashSet<String> set=new HashSet<>();
		
		String filePath = "output1.txt";
        String line = "";
        String delimiter = ","; // Set your CSV separator
		
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            
            String headerLine = br.readLine(); 
            if (headerLine != null) {
                System.out.println("Headers: " + headerLine);
            }

            // Read the file line by line
            while ((line = br.readLine()) != null) {
                set.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
		
        
        
        System.out.println("set size : "+set.size());
		
		
		writer.close();
		
	}

}
