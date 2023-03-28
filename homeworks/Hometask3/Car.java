package java_hometasks.homeworks.Hometask3;

import java.util.HashSet;
import java.util.Set;

public class Car {

    public static final String TO_STRING_CAR_TEMPLATE = "Car{year: %s, " +
            "model: %s, " +
            "engineVol: %s, " +
            "color: %s, " +
            "wheelSize: %s, " +
            "options: %s}";
    private final Model model;

    private final int  year;
    private Wheel wheel;
    private final Engine engine;
    private Color color;
    private Set<Option> options;

    Car (int year, Model model, Wheel wheel, Engine engine, Color color, Set<Option> options) {
        this.year = year;
        this.model = model;
        this.wheel = wheel;
        this.engine = engine;
        this.color = color;
        this.options = options != null ? options : new HashSet<>();

    }

    public Model getModel() {
        return model;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public Engine getEngine() {
        return engine;
    }

    public Color getColor() {
        return color;
    }

    public Set<Option> getOptions() {
        return options;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setOptions(Set<Option> options) {
        this.options = options;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model=" + model +
                ", year=" + year +
                ", wheel=" + wheel +
                ", engine=" + engine +
                ", color=" + color +
                ", options=" + options +
                '}';
    }
}







