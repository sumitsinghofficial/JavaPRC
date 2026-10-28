package si.sumitsingh.javaprc.collections;


import java.util.HashSet;
import java.util.Objects;

public class HashSetDemo {
	
	public static void main(String[] args) {
		
		Employee e1=new Employee(1, "Sumit", 2000);
		Employee e2=new Employee(1,"Sumit",2000);
		
		
		HashSet<Employee> hs=new HashSet<>();
		hs.add(e1);
		hs.add(e2);
		System.out.println("HashSet size : "+hs.size());
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println("Equals method : "+e1.equals(e2));
		
		
		HashSet<String> hss=new HashSet<>();
		hss.add("Sumit");
		hss.add("Sumit");		
		System.out.println("HashSet size : "+hss.size());

		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

class Employee {
	
	int id;
	String name;
	double sal;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	
	public Employee(int id, String name, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, id);
		
	}
	
	
	@Override
	public boolean equals(Object obj) {
		
		// 1. Check if compared to itself
        if (this == obj) return true;
        
        // 2. Check for null and ensure exact class match
        if (obj == null || getClass() != obj.getClass()) return false;
        
        // 3. Cast to the correct type
        Employee other = (Employee) obj;
        
        // 4. Compare relevant fields
        return id == other.id && Objects.equals(name, other.name) && sal==other.sal;
		
		
	}
    
}
