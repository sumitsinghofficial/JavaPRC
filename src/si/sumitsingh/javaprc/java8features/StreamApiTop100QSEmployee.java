package si.sumitsingh.javaprc.java8features;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamApiTop100QSEmployee {
	
	public static void main(String[] args) {
		
		System.out.println("StreamApiTop100QSEmployee ");

		List<Employee> employeeList = Employee.getEmployeeList();
		
		
		// 41. Find all employees whose salary is greater than ₹50,000.
		List<Employee> empWith50KSal = employeeList.stream().filter(emp -> emp.getSalary() > 50000)
				.collect(Collectors.toList());
		System.out.println("empWith50KSal : "+empWith50KSal);

		// 42. Find employees belonging to the IT department.
		List<Employee> empWithITDept = employeeList.stream().filter(emp -> emp.getDepartment().equals("IT"))
				.collect(Collectors.toList());
		System.out.println("empWithITDept : "+empWithITDept);
		
		// 43. Find the employee with the highest salary.
		Optional<Employee> max = employeeList.stream().max(Comparator.comparingDouble(Employee::getSalary));
		System.out.println("Max salary : "+max);

		// 44. Find the employee with the lowest salary.
		Optional<Employee> min = employeeList.stream().min(Comparator.comparingDouble(Employee::getSalary));
		System.out.println("Min salary : "+min);
		
		// 45. Find the second-highest-paid employee.
		List<Employee> secondMaxSal = employeeList.stream()
				.sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).limit(1)
				.collect(Collectors.toList());
		System.out.println("Second Max salary : "+secondMaxSal);
		
		
		// 46. Find the highest-paid employee in each department.
		Map<String, Optional<Employee>> maxSalPerDept = employeeList.stream().collect(Collectors.groupingBy(
				Employee::getDepartment, Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));
		System.out.println("Max Sal per dept" + maxSalPerDept);

		// 47. Find the lowest-paid employee in each department.
		Map<String, Optional<Employee>> minSalPerDept = employeeList.stream().collect(Collectors.groupingBy(
				Employee::getDepartment, Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));
		System.out.println("Min Sal per dept" + minSalPerDept);

		// 48. Calculate the average salary of employees.
		Double avgSal = employeeList.stream().collect(Collectors.averagingDouble(Employee::getSalary));
		System.out.println("Avg Sal" + avgSal);

		// 49. Calculate the average salary of each department.
		Map<String, Double> avgSalPerDept = employeeList.stream().collect(
				Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
		System.out.println("Avg Sal per dept" + avgSalPerDept);

		// 50. Calculate the total salary paid by the company.
		Double totalSal = employeeList.stream().map(Employee::getSalary).reduce(0.0, (sum, salary) -> sum + salary);
		System.out.println("Total sal : " + totalSal);
		
		
		//51. Calculate the total salary paid by each department.
		 Map<String, Double> sumOfSalEachDept = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.summingDouble(Employee::getSalary)));
		 System.out.println("Total sal by dept : "+sumOfSalEachDept);
		 
		//52. Count the number of employees in each department.
		 Map<String, Long> deptWiseEmployeeCount = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		 System.out.println("Dept wise employee count : "+deptWiseEmployeeCount);
		 
		 
		 //53. Group employees by department.
		Map<String, List<Employee>> groupByDept = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
		System.out.println("Group by Dept"+groupByDept);
		
		//54. Group employees by gender.
		Map<String, List<Employee>> groupByGender = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender));
		System.out.println("Group by gender"+groupByGender);
		
		
		//55. Group employees by city.
		Map<String, List<Employee>> groupByCity = employeeList.stream().collect(Collectors.groupingBy(Employee::getCity));
		System.out.println("Group by City : "+groupByCity);
		
		
		//56. Find the average age of employees in each department.
		Map<String, Double> averageAgeOfEmployeeIinEachDepartment = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.collectingAndThen(Collectors.toList(), list-> list.stream().collect(Collectors.averagingDouble(Employee::getSalary)))));
		System.out.println("Average age of employees in each department : "+averageAgeOfEmployeeIinEachDepartment);
		
		
		//57. Find employees whose age is greater than 30.
		List<Employee> ageGreaterThan30 = employeeList.stream().filter(emp-> emp.getAge()>30).collect(Collectors.toList());
		System.out.println("Age greater than 30 employee by age : "+ageGreaterThan30);
		
		//58. Find employees with more than five years of experience.
		List<Employee> experienceGreaterThan5 = employeeList.stream().filter(emp-> emp.getAge()>30).collect(Collectors.toList());
		System.out.println("experience greater than 5 : "+experienceGreaterThan5);
		
		
		//59. Find the most experienced employee.
		Employee mostExperiencedEmployee = employeeList.stream().max(Comparator.comparingInt(Employee::getExperience)).get();
		System.out.println("Youngest employee by age : "+mostExperiencedEmployee);
		
		
		//60. Find the youngest employee in each department.
		Employee youngestEmployee = employeeList.stream().min(Comparator.comparingInt(Employee::getAge)).get();
		System.out.println("Youngest employee by age : "+youngestEmployee);
		
		//61. Find the oldest employee in each department.
		Employee oldestEmployee = employeeList.stream().max(Comparator.comparingDouble(Employee::getAge)).get();
		System.out.println("Oldest employee by age : "+oldestEmployee);
		
		/*
		//62. Sort employees by salary in descending order.
		List<Employee> sortBySal = employeeList.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).collect(Collectors.toList());
		System.out.println("Sorted by Salary : "+sortBySal);
		
		
		//63. Sort employees by department and then salary.
		//List<Entry<String, List<Employee>>> collect = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment)).entrySet().stream().sorted().collect(Collectors.toList());
		//System.out.println(collect);
		
		
		//64. Find the top three highest-paid employees in each department.
				
		Map<String, List<Employee>> collect3 = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, 
						Collectors.collectingAndThen(Collectors.toList(), 
								                list->list.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
								                .limit(3).collect(Collectors.toList()))));
		System.out.println("collect 3 : "+collect3);
				
				
				

				
				
		Map<String, List<Employee>> collect2 = employeeList.stream()
		        .collect(Collectors.groupingBy(
		            Employee::getDepartment,
		            Collectors.collectingAndThen(
		                Collectors.toList(),
		                list -> list.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).limit(3)
		                .collect(Collectors.toList())                            
		            )
		        ));
				
		System.out.println("collect 2 : "+collect2);
				
		//65. Partition employees into two groups based on whether their salary exceeds ₹75,000.
		//Collectors.partitioningBy(Employee.getSalary()>75000)
				
		Map<Boolean, List<Employee>> collect4 = employeeList.stream().collect(Collectors.partitioningBy(employee  -> employee.getSalary()>75000));
		System.out.println("collect 4 : "+collect4);
		List<Employee> list = collect4.get(true);
		List<Employee> list1 = collect4.get(false);
				
		System.out.println(list);
		System.out.println(list1);
		
		
		*/

	}

}
