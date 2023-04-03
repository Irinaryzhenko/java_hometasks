package java_hometasks.homeworks.CourseProject.CAR;

import java_hometasks.homeworks.CourseProject.CAR.carEnum.Color;
import java_hometasks.homeworks.CourseProject.CAR.carEnum.Engine;
import java_hometasks.homeworks.CourseProject.CAR.carEnum.Option;
import java_hometasks.homeworks.CourseProject.CAR.carEnum.Wheel;
import java_hometasks.homeworks.CourseProject.CAR.models.ModelOfAudi;

import java.util.Set;

public class Audi extends Car{
    public static final String TO_STRING_AUDI_TEMPLATE = "AUDI{year: %s, " +
            "model: %s, " +
            "engineVol: %s, " +
            "color: %s, " +
            "wheelSize: %s, " +
            "options: %s, " +
            "design: %s}";

    private final ModelOfAudi modelOfAudi;
    private static String design = "Limited edition";

    public Audi(int YEAR, Wheel wheel, Engine engine, Color color, Set<Option> options, ModelOfAudi modelOfAudi, String design) {
        super(YEAR, wheel, engine, color, options);
        this.modelOfAudi = modelOfAudi;
        this.design = design;
    }

    public ModelOfAudi getModelOfAudi() {
        return modelOfAudi;
    }

    public String getDesign() {

        return design;
    }

    public void setDesign(String design) {

        Audi.design = design;
    }
}

