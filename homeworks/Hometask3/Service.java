package java_hometasks.homeworks.Hometask3;

import java.util.Set;

public class Service {
    public void changeColor(Car car, Color color) {
        if (car != null && color != null && !color.equals(car.getColor())) {
            car.setColor(color);
        }
    }

    public void changeWheels(Car car, Wheel wheel) {
        if (car != null && wheel != null && !wheel.equals(car.getWheel())) {
            car.setWheel(wheel);
        }
    }

    public void addOption(Car car, Option option) {
        if (car != null && option != null) {
            car.getOptions().add(option);
        }
    }

    public void deleteOption(Car car, Option option) {
        if (car != null && option != null) {
            car.getOptions().remove(option);
        }
    }
    public void setOptions(Car car, Set<Option> options) {
        if (car != null && options != null) {
            car.setOptions(options);
        }
    }
}

