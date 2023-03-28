package java_hometasks.homeworks.Hometask3;

import java.util.*;

import static java.lang.String.format;

public class Factory {

    private static final int YEAR = 2022;

    private final Color[] colors;
    private final Model[] models;
    private final Wheel[] wheels;
    private final Engine[] engines;
    private Storage storage;

    public Factory(Model[] models, Color[] colors, Wheel[] wheels, Engine[] engines) {
        this.models = models;
        this.colors = colors;
        this.wheels = wheels;
        this.engines = engines;
        this.storage = new Storage();
        fillStorageWithCars();

    }
        public Car createCar(Model model, Wheel wheel, Engine engine, Color color, Set<Option> options) {
        Car car = storage.getCarFromStorage(model, wheel, engine, color);
        if (car != null) {
            if (car.getColor() != color) {
                car.setColor(color);
            }
            if (car.getWheel() != wheel) {
                car.setWheel(wheel);
            }
            // Add options check if needed.
            car.setOptions(options);
            return car;
        }
        return new Car(YEAR, model, wheel, engine, color, options);
    }
    public String getConfigurations() {
        return format (
                "Factory can produce: colors: %s, models: %s, wheels: %s, engines: %s",
                Arrays.toString(colors),
                Arrays.toString(models),
                Arrays.toString(wheels),
                Arrays.toString(engines)
        );
    }
    private void fillStorageWithCars() {
        // Any custom logic about creating initial cars.
        Car car = new Car(YEAR, Model.AUDI, Wheel.BIG, Engine.HIGHT, Color.BLACK, new HashSet<>());
        this.storage.addCarToStorage(car);
        Set<Option> options = new HashSet<>();
        options.add(Option.AUTOSTART);
        car = new Car(YEAR, Model.BMW, Wheel.BIG, Engine.HIGHT, Color.RED, options);
        this.storage.addCarToStorage(car);

    }
}













