package java_hometasks.homeworks.Hometask3;

import java.util.ArrayList;
import java.util.List;

public class Storage {
    private final List<Car> cars = new ArrayList<>();
    public void addCarToStorage(Car car) {
        cars.add(car);
    }
    public Car getCarFromStorage(Model model, Wheel wheel, Engine engine, Color color) {
        Car car = null;
        int index = 0;
        for (int i = 0; i < cars.size(); i++) {
            Car temp = cars.get(i);
            if (temp.getModel() == model && temp.getEngine() == engine) {
                if (car == null) {
                    car = temp;
                    index = i;
                    continue;
                }
                if (temp.getColor() == color && car.getColor() != color) {
                    car = temp;
                    index = i;
                    continue;
                }
                if (temp.getWheel() == wheel && car.getWheel() != wheel) {
                    car = temp;
                    index = i;
                }
            }
        }
        if (car != null) {
            cars.remove(index);
        }
        return car;
    }

}


