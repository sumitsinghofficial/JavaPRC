package si.sumitsingh.javaprc.java8features;


import java.util.ArrayList;
import java.util.List;

public class Employee {

    private int id;
    private String name;
    private String department;
    private String gender;
    private int age;
    private double salary;
    private int experience;
    private String city;

    // Default Constructor
    public Employee() {
    }

    // Parameterized Constructor
    public Employee(int id, String name, String department,
                    String gender, int age, double salary,
                    int experience, String city) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.gender = gender;
        this.age = age;
        this.salary = salary;
        this.experience = experience;
        this.city = city;
    }

    // Getters and Setters

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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", experience=" + experience +
                ", city='" + city + '\'' +
                '}';
    }

    // Generate 250 Employees
    public static List<Employee> getEmployeeList() {

        List<Employee> employees = new ArrayList<>();

        String[] names = {
            "Amit", "Rahul", "Priya", "Sneha", "Vikas",
            "Anjali", "Rohit", "Pooja", "Sumit", "Neha",
            "Arjun", "Kiran", "Deepak", "Riya", "Suresh",
            "Meena", "Manish", "Kavita", "Nikhil", "Swati",
            "Akash", "Divya", "Rajesh", "Simran", "Varun"
        };

        String[] departments = {
            "IT", "HR", "Finance", "Sales",
            "Marketing", "Operations", "Support",
            "Engineering", "Admin", "Management"
        };

        String[] cities = {
            "Pune", "Mumbai", "Delhi", "Bangalore",
            "Hyderabad", "Chennai", "Kolkata",
            "Noida", "Gurgaon", "Jaipur"
        };

        for (int i = 1; i <= 250; i++) {

            String name = names[(i - 1) % names.length]
                    + " " + i;

            String department =
                    departments[(i - 1) % departments.length];

            String gender = (i % 2 == 0)
                    ? "Female" : "Male";

            int age = 22 + (i % 35);

            int experience = Math.min(
                    i % 21,
                    age - 21
            );

            double salary = 25000
                    + ((i * 1379) % 125000);

            String city =
                    cities[((i - 1) / 10) % cities.length];

            Employee employee = new Employee(
                    i,
                    name,
                    department,
                    gender,
                    age,
                    salary,
                    experience,
                    city
            );

            employees.add(employee);
        }

        return employees;
    }

    // Main Method
    public static void main(String[] args) {

        List<Employee> employees = getEmployeeList();

        System.out.println("Total Employees: " + employees.size());

        employees.forEach(System.out::println);
    }
}

