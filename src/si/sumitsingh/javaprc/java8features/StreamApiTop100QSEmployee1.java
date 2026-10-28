package si.sumitsingh.javaprc.java8features;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiTop100QSEmployee1 {
	public static void main(String[] args) {
		
		System.out.println("StreamApiTop100QSEmployee ");

		List<Employee> employeeList = Employee.getEmployeeList();
		
		/*	Week 4: Advanced Collectors and FlatMap (66–85)
		    DIFFICULTY: HARD
		 */
		
		// 66. Convert a List<Employee> into a Map<Integer, Employee> using employee ID as the key.
		Map<Integer, Employee> listToMap = employeeList.stream().collect(Collectors.toMap(Employee::getId, emp->emp));
		System.out.println("List to Map : "+listToMap);
		
		
		// 67. Convert a list of employees into a map of employee names and salaries, handling duplicate names.
		
		
		// 68. Group employees by department and gender using nested groupingBy().
		Map<String, Map<String, List<Employee>>> collect = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.groupingBy(Employee::getGender)));
		System.out.println(collect);
		
		collect.forEach((department, gender)->{
			System.out.println("Department: " + department);
			gender.forEach((gen, empList)->{
				// System.out.println(gen+" "+empList);
				System.out.println("  Gender: " + gen + " -> " + empList);
			});
		});
		
		
		
		// 69. Find the highest-paid employee by gender.
		
		Map<String, List<Employee>> collect2 = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, 
				Collectors.collectingAndThen(Collectors.toList(), 
						list-> list.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).limit(1).collect(Collectors.toList()))));
		System.out.println(" Find the highest-paid employee by gender : "+collect2);
		
		
		// 70. Find the number of employees earning more than ₹50,000 in each department.
		Map<String, Long> collect3 = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, 
				Collectors.collectingAndThen(Collectors.toList(), list->list.stream().filter(emp -> emp.getSalary()>50000).count())));
		
		System.out.println("Find the number of employees earning more than ₹50,000 in each department : "+collect3);
		
		
		// 71. Find the department with the highest total salary.
		String department = employeeList.stream().max(Comparator.comparingDouble(Employee::getSalary)).get().getDepartment();
		System.out.println("Find the number of employees earning more than ₹50,000 in each department : "+collect3);
		// 72. Find the department with the highest average salary.
		
		
		// 73. Find the department having the maximum number of employees.
		
		
		// 74. Create a comma-separated string of employee names using joining().
		
		
		// 75. Find the distinct departments from an employee list.
		
		
		// 76. Flatten a List<List<Integer>> into a single list using flatMap().
		
		
		// 77. Flatten a list of departments containing employee lists.
		
		
		
		// 78. Find all unique skills from a list of employees, where each employee has multiple skills.
		
		
		// 79. Find employees sharing the same skill using flatMap() and groupingBy().
		
		
		// 80. Convert a list of sentences into a frequency map of words.
		
		
		// 81. Merge two lists, remove duplicates, and sort the result.
		
		
		// 82. Find common elements between two lists using Stream API.
		
		
		// 83. Find elements present in the first list but not in the second.
		
		
		// 84. Find the longest word across multiple sentences.
		
		
		// 85. Calculate summary statistics (count, sum, min, max, average) using summarizingDouble().
		
		
		
		
	}

}
