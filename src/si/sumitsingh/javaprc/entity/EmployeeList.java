package si.sumitsingh.javaprc.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EmployeeList {

    private static final String[] NAMES = {
        "Rahul", "Priya", "Amit", "Sneha", "Vikram",
        "Neha", "Rohit", "Anjali", "Karan", "Pooja",
        "Arjun", "Riya", "Suresh", "Kavita", "Deepak",
        "Meera", "Manish", "Swati", "Raj", "Divya"
    };

    private static final String[] DEPARTMENTS = {
        "IT", "HR", "Finance", "Sales",
        "Marketing", "Operations", "Support"
    };

    private static final String[] CITIES = {
        "Pune", "Mumbai", "Delhi", "Bangalore",
        "Hyderabad", "Chennai", "Kolkata", "Noida"
    };

    public static List<Employee> getEmployees() {
        return generateEmployees(150);
    }

    public static List<Employee> generateEmployees(int count) {

        if (count < 0) {
            throw new IllegalArgumentException(
                "Employee count cannot be negative"
            );
        }

        List<Employee> employees = new ArrayList<>();
        Random random = new Random(12345);

        for (int i = 1; i <= count; i++) {

            String name = NAMES[random.nextInt(NAMES.length)]
                    + " " + i;

            String department =
                    DEPARTMENTS[random.nextInt(DEPARTMENTS.length)];

            double salary = 25000 + random.nextInt(175001);

            int age = 21 + random.nextInt(40);

            String gender = random.nextBoolean()
                    ? "Male" : "Female";

            String city =
                    CITIES[random.nextInt(CITIES.length)];

            LocalDate joiningDate = LocalDate.of(
                    2015 + random.nextInt(12),
                    1 + random.nextInt(12),
                    1 + random.nextInt(28)
            );

            employees.add(new Employee(
                    i, name, department, salary,
                    age, gender, city, joiningDate
            ));
        }

        return employees;
    }

    public static void main(String[] args) {

        List<Employee> employees = getEmployees();

        System.out.println("Total Employees: "
                + employees.size());

        employees.forEach(System.out::println);
    }
}
