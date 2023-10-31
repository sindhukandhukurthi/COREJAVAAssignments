package question3;
import java.util.*;

class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private String department;
    private double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // Implement the compareTo method for sorting
    @Override
    public int compareTo(Employee other) {
        return this.id - other.id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }
}

public class EmployeeSortingApp {
    public static void main(String[] args) {
        TreeSet<Employee> employees = new TreeSet<>();
        employees.add(new Employee(101, "John", "HR", 55000.0));
        employees.add(new Employee(102, "Alice", "Finance", 60000.0));
        employees.add(new Employee(103, "Bob", "Engineering", 70000.0));
        employees.add(new Employee(104, "Eve", "Marketing", 50000.0));
        employees.add(new Employee(105, "David", "Engineering", 75000.0));
        employees.add(new Employee(106, "Sophia", "HR", 52000.0));
        employees.add(new Employee(107, "Grace", "Finance", 62000.0));
        employees.add(new Employee(108, "Michael", "Engineering", 72000.0));
        employees.add(new Employee(109, "Olivia", "Marketing", 51000.0));
        employees.add(new Employee(110, "William", "Engineering", 74000.0));

        Scanner scanner = new Scanner(System.in);

        System.out.println("Run Application:");
        System.out.println("a) ID");
        System.out.println("b) Name");
        System.out.println("c) Department");
        System.out.println("d) Salary");
        System.out.print("Your choice: ");
        String choice = scanner.next();

        switch (choice) {
            case "a":
                printSortedEmployees(employees);
                break;
            case "b":
                printSortedEmployeesByName(employees);
                break;
            case "c":
                printSortedEmployeesByDepartment(employees);
                break;
            case "d":
                printSortedEmployeesBySalary(employees);
                break;
            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
    }

    public static void printSortedEmployees(TreeSet<Employee> employees) {
        for (Employee employee : employees) {
            System.out.println("ID: " + employee.getId() + ", Name: " + employee.getName() +
                    ", Department: " + employee.getDepartment() + ", Salary: " + employee.getSalary());
        }
    }

    public static void printSortedEmployeesByName(TreeSet<Employee> employees) {
        TreeSet<Employee> sortedByName = new TreeSet<>(Comparator.comparing(Employee::getName));
        sortedByName.addAll(employees);

        for (Employee employee : sortedByName) {
            System.out.println("ID: " + employee.getId() + ", Name: " + employee.getName() +
                    ", Department: " + employee.getDepartment() + ", Salary: " + employee.getSalary());
        }
    }

    public static void printSortedEmployeesByDepartment(TreeSet<Employee> employees) {
        TreeSet<Employee> sortedByDepartment = new TreeSet<>(Comparator.comparing(Employee::getDepartment));
        sortedByDepartment.addAll(employees);

        for (Employee employee : sortedByDepartment) {
            System.out.println("ID: " + employee.getId() + ", Name: " + employee.getName() +
                    ", Department: " + employee.getDepartment() + ", Salary: " + employee.getSalary());
        }
    }

    public static void printSortedEmployeesBySalary(TreeSet<Employee> employees) {
        TreeSet<Employee> sortedBySalary = new TreeSet<>(Comparator.comparing(Employee::getSalary));
        sortedBySalary.addAll(employees);

        for (Employee employee : sortedBySalary) {
            System.out.println("ID: " + employee.getId() + ", Name: " + employee.getName() +
                    ", Department: " + employee.getDepartment() + ", Salary: " + employee.getSalary());
        }
    }
}
