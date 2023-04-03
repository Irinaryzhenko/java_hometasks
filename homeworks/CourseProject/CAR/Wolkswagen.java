package java_hometasks.homeworks.CourseProject.CAR;

import java_hometasks.homeworks.CourseProject.CAR.carEnum.Color;
import java_hometasks.homeworks.CourseProject.CAR.carEnum.Engine;
import java_hometasks.homeworks.CourseProject.CAR.carEnum.Option;
import java_hometasks.homeworks.CourseProject.CAR.carEnum.Wheel;
import java_hometasks.homeworks.CourseProject.CAR.models.ModelOfWolkswagen;

import java.util.Set;

public class Wolkswagen extends Car{
    public static final String TO_STRING_WOLKSWAGEN_TEMPLATE = "AUDI{year: %s, " +
            "model: %s, " +
            "engineVol: %s, " +
            "color: %s, " +
            "wheelSize: %s, " +
            "options: %s, " +
            "tintedWindows: %s}";

    private final ModelOfWolkswagen modelOfWolkswagen;

    private boolean tintedWindows;

    public Wolkswagen(int YEAR, Wheel wheel, Engine engine, Color color, Set<Option> options,
                      ModelOfWolkswagen modelOfWolkswagen, boolean tintedWindows) {
        super(YEAR, wheel, engine, color, options);
        this.modelOfWolkswagen = modelOfWolkswagen;
        this.tintedWindows = tintedWindows;
    }

    public ModelOfWolkswagen getModelOfWolkswagen() {
        return modelOfWolkswagen;
    }

    public boolean isTintedWindows() {
        return tintedWindows;
    }

    public void setTintedWindows(boolean tintedWindows) {

        this.tintedWindows = tintedWindows;
    }


}

