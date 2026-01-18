
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    public boolean equals(Object compared) {

        if (this == compared) {
            return true;
        }

        if (!(compared instanceof Person)) {
            return false;
        }

        Person comparedPerson = (Person) compared;
        return Objects.equals(this.name, comparedPerson.name) && Objects.equals(this.birthday, comparedPerson.birthday)
                && Objects.equals(this.height, comparedPerson.height) && Objects.equals(this.weight, comparedPerson.weight);
    }

    // implement an equals method here for checking the equality of objects
}
