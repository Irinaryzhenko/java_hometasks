package java_hometasks.homeworks.Homework6Final;
import java.util.Objects;
import java.util.Set;
public class Robot {
    private Set<Parts> partsOfRobot;

    public Robot(Set<Parts> partsOfRobot) {
        this.partsOfRobot = partsOfRobot;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Robot robot = (Robot) o;
        return Objects.equals(partsOfRobot, robot.partsOfRobot);
    }

    @Override
    public int hashCode() {
        return Objects.hash(partsOfRobot);
    }

    @Override
    public String toString() {
        return "Robot{" +
                "partsOfRobot=" + partsOfRobot +
                '}';
    }
}
