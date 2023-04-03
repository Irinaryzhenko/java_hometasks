package java_hometasks.homeworks.CourseProject.CAR;

import java_hometasks.homeworks.CourseProject.CAR.carEnum.*;
import java_hometasks.homeworks.CourseProject.CAR.models.ModelOfBMW;

import java.util.Set;

public class BMW extends Car{
    public static final String TO_STRING_BMW_TEMPLATE = "BMW{year: %s, " +
            "model: %s, " +
            "engineVol: %s, " +
            "color: %s, " +
            "wheelSize: %s, " +
            "options: %s, " +
            "carBodyType: %s}";
    private ModelOfBMW model;
    private CarBodyType carBodyType;

    public BMW(int YEAR, Wheel wheel, Engine engine, Color color, Set<Option> options, ModelOfBMW model, CarBodyType carBodyType) {
        super(YEAR, wheel, engine, color, options);
        this.model = model;
        this.carBodyType = carBodyType;
    }


    public ModelOfBMW getModelOfBMW() {

        return model;
    }

    public CarBodyType getCarBodyType() {

        return carBodyType;
    }

    public void setCarBodyType(CarBodyType carBodyType) {

        this.carBodyType = carBodyType;
    }

    public void setModelOfBMW(ModelOfBMW model) {

        this.model = model;
    }


}


