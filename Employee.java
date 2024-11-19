import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Employee implements Comparable<Employee> {
    int Id;
    String Name;
    String Gender;
    int YearJoined;

    public Employee(int YearJoined, String Gender, String Name, int Id) {
        this.Id = Id;
        this.Gender = Gender;
        this.Name = Name;
        this.YearJoined = YearJoined;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public String getGender() {
        return Gender;
    }

    public int getYearJoined() {
        return YearJoined;
    }

    public int compareTo(Employee other) {
        return Integer.compare(this.YearJoined, other.YearJoined); // Compare years of joining
    }

    public String toString() {
        return "EmployeeId" + Id + "EmployeeName" + Name + "EmployeeGender" + Gender + "YearJoin" + YearJoined;
    }
}