package si.sumitsingh.javaprc;

public class ControlStmt {

	public static void main(String[] args) {
		
		int x = 10;      
        int y = 12;      
        if(x+y > 20) {      
            System.out.println("x + y is greater than 20");      
        }     
		
		
        
        int i=0;
        while(i<9) {
        	
        	System.out.println("i : "+i);
        	i++;
        }
        
        System.out.println("\n j  Values: ");
        int j=0;
        
        do {
        	System.out.println("j : "+j);
        	j++;
        }while(j<9);
		
		
	}
}
