package java_hometasks.homeworks.CourseProject.Factories;

import java_hometasks.homeworks.CourseProject.CAR.Audi;
import java_hometasks.homeworks.CourseProject.CAR.Car;
import java_hometasks.homeworks.CourseProject.CAR.carEnum.Color;
import java_hometasks.homeworks.CourseProject.CAR.carEnum.Engine;
import java_hometasks.homeworks.CourseProject.CAR.carEnum.Option;
import java_hometasks.homeworks.CourseProject.CAR.carEnum.Wheel;
import java_hometasks.homeworks.CourseProject.CAR.models.ModelOfAudi;
import java_hometasks.homeworks.CourseProject.Storages.Storage;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static java.lang.String.format;

public class AudiFactory extends Factory{
    private final ModelOfAudi[] modelOfAudis;
    public static String design = "Limited edition";
    private Storage audiStorage;

    public AudiFactory(Color[] colors, Wheel[] wheels, Engine[] engines, ModelOfAudi[] modelOfAudis, String design) {
        super(colors, wheels, engines);
        this.modelOfAudis = modelOfAudis;
        this.design = design;
        this.audiStorage = new Storage();
        fillAudiStorageWithCars();
    }

    public Audi createAudiCar(ModelOfAudi modelOfAudi, Wheel wheel, Engine engine,
                              Color color, Set<Option> options, String design) {
        Audi carAudi = audiStorage.getAudiCarFromStorage(modelOfAudi, wheel, engine, color, design);
        if (carAudi != null) {
            if (carAudi.getColor() != color) {
                carAudi.setColor(color);
            }
            if (carAudi.getWheel() != wheel) {
                carAudi.setWheel(wheel);
            }
            if (carAudi.getDesign() != design) {
                carAudi.setDesign(design);
            }
            // Add options check if needed.
            carAudi.setOptions(options);
            return carAudi;
        }
        return new Audi(YEAR, wheel, engine, color, options, modelOfAudi, design);
    }

    public String getConfigurationsAudi() {
        return format(
                "Audi Factory can produce: colors: %s, models: %s, wheels: %s, engines: %s, design: %s",
                Arrays.toString(colors),
                Arrays.toString(modelOfAudis),
                Arrays.toString(wheels),
                Arrays.toString(engines),
                design
        );

    }

    private void fillAudiStorageWithCars() {
        // Any custom logic about creating initial cars.
        Audi carAudi = new Audi(YEAR, Wheel.BIG,
                Engine.HIGHT, Color.BLACK,
                new HashSet<>(), ModelOfAudi.Q7, design.toString());
        this.audiStorage.addCarToStorage(carAudi);
        Set<Option> options = new HashSet<>();
        options.add(Option.AUTOSTART);
        carAudi = new Audi(YEAR, Wheel.BIG, Engine.HIGHT, Color.RED, options,
                ModelOfAudi.Q7, design.toString());
        this.audiStorage.addCarToStorage(carAudi);

    }
}
