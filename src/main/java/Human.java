
import java.util.Comparator;

public class Human implements Comparable<Human>{
    private final String firstName;
    private final String lastName;
    private final int age;

    public Human(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Human o) {
        return this.getLastName().compareTo(o.getLastName());
    }

    @Override
    public String toString() {
        return lastName;
    }
}