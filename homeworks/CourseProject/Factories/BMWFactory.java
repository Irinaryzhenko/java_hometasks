package java_hometasks.homeworks.CourseProject.Factories;

import java_hometasks.homeworks.CourseProject.CAR.BMW;
import java_hometasks.homeworks.CourseProject.CAR.Car;
import java_hometasks.homeworks.CourseProject.CAR.carEnum.*;
import java_hometasks.homeworks.CourseProject.CAR.models.ModelOfBMW;
import java_hometasks.homeworks.CourseProject.Storages.Storage;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static java.lang.String.format;

public class BMWFactory extends Factory{
    private final ModelOfBMW[] modelsOfBmw;
    private CarBodyType[] carBodyTypies;
    private Storage bmwStorage;

    public BMWFactory(Color[] colors, Wheel[] wheels, Engine[] engines, ModelOfBMW[] modelsOfBmw, CarBodyType[] carBodyTypies) {
        super(colors, wheels, engines);
        this.modelsOfBmw = modelsOfBmw;
        this.carBodyTypies = carBodyTypies;
        this.bmwStorage = new Storage();
        fillBMWStorageWithCars();
    }


    public BMW createBmwCar(ModelOfBMW modelOfBMW, Wheel wheel, Engine engine, Color color,
                            Set<Option> options, CarBodyType carBodyType) {
        BMW carBmw = bmwStorage.getBMWCarFromStorage (modelOfBMW, wheel, engine, color,carBodyType);
        if (carBmw != null) {
            if (carBmw.getColor() != color) {
                carBmw.setColor(color);
            }
            if (carBmw.getWheel() != wheel) {
                carBmw.setWheel(wheel);
            }
            if (carBmw.getCarBodyType() != carBodyType) {
                carBmw.setCarBodyType(carBodyType);
            }
            // Add options check if needed.
            carBmw.setOptions(options);
            return carBmw;
        }
        return new BMW(YEAR, wheel, engine, color, options, modelOfBMW, carBodyType);
    }

    public String getConfigurationsBMW() {
        return format(
                "Bmw Factory can produce: colors: %s, models: %s, wheels: %s, engines: %s, carBodyTypies: %s",
                Arrays.toString(colors),
                Arrays.toString(modelsOfBmw),
                Arrays.toString(wheels),
                Arrays.toString(engines),
                Arrays.toString(carBodyTypies)
        );

    }

    private void fillBMWStorageWithCars() {
        // Any custom logic about creating initial cars.
        BMW carBmw = new BMW(YEAR,  Wheel.BIG, Engine.HIGHT,
                Color.BLACK, new HashSet<>(), ModelOfBMW.X5, CarBodyType.COUPE);
        this.bmwStorage.addCarToStorage(carBmw);
        Set<Option> options = new HashSet<>();
        options.add(Option.AUTOSTART);
        carBmw = new BMW(YEAR, Wheel.BIG, Engine.HIGHT, Color.RED, options,
                ModelOfBMW.X6, CarBodyType.CABRIOLET);
        this.bmwStorage.addCarToStorage(carBmw);

    }
}
