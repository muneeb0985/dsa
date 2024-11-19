import java.util.HashSet;
import java.util.Scanner;

public class EmpManagement {
    private HashSet<Emp> employees = new HashSet<>();

    public void addEmployee(String name, int id) {
        Emp newEmp = new Emp(name, id);
        if (employees.contains(newEmp)) {
            System.out.println("Employee already exists.");
        } else {
            employees.add(newEmp);
            System.out.println("Employee added.");
        }
    }

    public void displayEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees to display.");
        } else {
            System.out.println("Employee List:");
            for (Emp emp : employees) {
                System.out.println(emp);
            }
        }
    }

    public static void main(String[] args) {
        EmpManagement management = new EmpManagement();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter employee name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter employee ID: ");
                    int id = scanner.nextInt();
                    management.addEmployee(name, id);
                    break;
                case 2:
                    management.displayEmployees();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    scanner.close(); // Close the scanner
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}
