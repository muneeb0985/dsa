import java.util.*;

public class EmployeeMain {
    public static void main(String[] args) {
        ArrayList<Employee> king = new ArrayList<>();
        king.add(new Employee(2024, " Male ", " Muneeb ", 123));
        king.add(new Employee(2023, " Male ", " Muneeb ", 123));
        king.add(new Employee(2022, " Male ", " Muneeb ", 123));
        Collections.sort(king);
        System.out.println(" Employees sorted by year of joining (Comparable): ");
        for (Employee i : king) {
            System.out.println(i);
        }
        Comparator<Employee> comparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee emp1, Employee emp2) {
                return Integer.compare(emp1.getYearJoined(), emp2.getYearJoined());
            }
        };
        Collections.sort(king, comparator);
        System.out.println("\nEmployees sorted by year of joining (Comparator):");
        for (Employee op : king) {
            System.out.println(king);
        }
    }
}
