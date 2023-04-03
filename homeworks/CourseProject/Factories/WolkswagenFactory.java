package java_hometasks.homeworks.CourseProject.Factories;

import java_hometasks.homeworks.CourseProject.CAR.Car;
import java_hometasks.homeworks.CourseProject.CAR.Wolkswagen;
import java_hometasks.homeworks.CourseProject.CAR.carEnum.Color;
import java_hometasks.homeworks.CourseProject.CAR.carEnum.Engine;
import java_hometasks.homeworks.CourseProject.CAR.carEnum.Option;
import java_hometasks.homeworks.CourseProject.CAR.carEnum.Wheel;
import java_hometasks.homeworks.CourseProject.CAR.models.ModelOfWolkswagen;
import java_hometasks.homeworks.CourseProject.Storages.Storage;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static java.lang.String.format;

public class WolkswagenFactory extends Factory{
    private final ModelOfWolkswagen[] modelOfWolkswagens;
    private boolean tintedWindows;
    private Storage wolkswagenStorage;

    public WolkswagenFactory(Color[] colors, Wheel[] wheels, Engine[] engines,
                             ModelOfWolkswagen[] modelOfWolkswagens, boolean tintedWindows) {
        super(colors, wheels, engines);
        this.modelOfWolkswagens = modelOfWolkswagens;
        this.tintedWindows = tintedWindows;
        this.wolkswagenStorage = new Storage();
        fillWolkswagenStorageWithCars();
    }

    public Wolkswagen createWolkswagenCar(ModelOfWolkswagen modelOfWolkswagen, Wheel wheel, Engine engine,
                                          Color color, Set<Option> options, boolean tintedWindows) {
        Wolkswagen carWolkswagen = wolkswagenStorage.getWolkswagenCarFromStorage(modelOfWolkswagen, wheel,
                engine, color, tintedWindows);
        if (carWolkswagen != null) {
            if (carWolkswagen.getColor() != color) {
                carWolkswagen.setColor(color);
            }
            if (carWolkswagen.getWheel() != wheel) {
                carWolkswagen.setWheel(wheel);
            }
            if (!carWolkswagen.isTintedWindows()) {
                carWolkswagen.setTintedWindows(tintedWindows);
            }
            // Add options check if needed.
            carWolkswagen.setOptions(options);
            return carWolkswagen;
        }
        return new Wolkswagen(YEAR, wheel, engine, color, options, modelOfWolkswagen, tintedWindows);
    }

    public String getConfigurationsWolkswagen() {
        return format(
                "Wolkswagen Factory can produce: colors: %s, models: %s, wheels: %s, engines: %s, tinted windows: %s",
                Arrays.toString(colors),
                Arrays.toString(modelOfWolkswagens),
                Arrays.toString(wheels),
                Arrays.toString(engines),
                tintedWindows
        );


    }

    private void fillWolkswagenStorageWithCars() {
        // Any custom logic about creating initial cars.
        Wolkswagen carWolkswagen = new Wolkswagen(YEAR,  Wheel.BIG,
                Engine.HIGHT, Color.BLACK,
                new HashSet<>(), ModelOfWolkswagen.TIGUAN, tintedWindows);
        this.wolkswagenStorage.addCarToStorage(carWolkswagen);
        Set<Option> options = new HashSet<>();
        options.add(Option.AUTOSTART);
        carWolkswagen = new Wolkswagen(YEAR, Wheel.BIG, Engine.HIGHT, Color.RED, options,
                ModelOfWolkswagen.SHARAN, tintedWindows);
        this.wolkswagenStorage.addCarToStorage(carWolkswagen);

    }
}

