package generic;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Employee {
    private int id;
    private String name;
    private double salary;
    private String department;

    public Employee(int id, String name, double salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
    }

    // You can override equals and hashCode to ensure uniqueness of Employee objects
    // In this example, we use the 'id' property for equality.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }
}

public class EmployeeHashSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Employee> employeeSet = new HashSet<>();

        while (true) {
            System.out.println("Enter employee details (id, name, salary, department) or 'exit' to finish:");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            String[] employeeData = input.split(",");
            if (employeeData.length != 4) {
                System.out.println("Invalid input. Please provide id, name, salary, and department separated by commas.");
                continue;
            }

            try {
                int id = Integer.parseInt(employeeData[0].trim());
                String name = employeeData[1].trim();
                double salary = Double.parseDouble(employeeData[2].trim());
                String department = employeeData[3].trim();

                Employee employee = new Employee(id, name, salary, department);
                employeeSet.add(employee);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please provide a valid id and salary.");
            }
        }

        System.out.println("Employee details in the HashSet:");
        for (Employee employee : employeeSet) {
            employee.displayDetails();
        }

        scanner.close();
    }
}

