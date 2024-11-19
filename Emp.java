import java.util.HashSet;
import java.util.Scanner;

class Emp {
    private String name;
    private int id;

    public Emp(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Emp) {
            Emp other = (Emp) obj;
            return this.name.equals(other.name) && this.id == other.id;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return name.hashCode() + Integer.hashCode(id);
    }

    @Override
    public String toString() {
        return "Emp{name='" + name + "', id=" + id + "}";
    }
}