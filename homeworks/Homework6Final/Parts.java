package java_hometasks.homeworks.Homework6Final;
import java.util.Objects;
public class Parts {
    private String name;

    public Parts(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Parts parts = (Parts) o;
        return Objects.equals(name, parts.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Parts{" +
                "name='" + name + '\'' +
                '}';
    }

}
