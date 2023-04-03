package java_hometasks.homeworks.CourseProject;

import java_hometasks.homeworks.CourseProject.CAR.Audi;
import java_hometasks.homeworks.CourseProject.CAR.BMW;
import java_hometasks.homeworks.CourseProject.CAR.Car;
import java_hometasks.homeworks.CourseProject.CAR.Wolkswagen;
import java_hometasks.homeworks.CourseProject.CAR.carEnum.*;
import java_hometasks.homeworks.CourseProject.CAR.models.ModelOfAudi;
import java_hometasks.homeworks.CourseProject.CAR.models.ModelOfBMW;
import java_hometasks.homeworks.CourseProject.CAR.models.ModelOfWolkswagen;

import java_hometasks.homeworks.CourseProject.Factories.AudiFactory;
import java_hometasks.homeworks.CourseProject.Factories.BMWFactory;
import java_hometasks.homeworks.CourseProject.Factories.Factory;
import java_hometasks.homeworks.CourseProject.Factories.WolkswagenFactory;


import java.util.Set;

public class ShowRoom {
    private final Service.ServiceColor serviceColor;
    private final Service.ServiceWheel serviceWheel;
    private final Service.ServiceOptions serviceOptions;

    private final AudiFactory audiFactory;
    private final WolkswagenFactory wolkswagenFactory;
    private final BMWFactory bmwFactory;
    public static Car car;

    public ShowRoom(Service.ServiceColor serviceColor, Service.ServiceWheel serviceWheel,
                    Service.ServiceOptions serviceOptions, AudiFactory audiFactory,
                    WolkswagenFactory wolkswagenFactory, BMWFactory bmwFactory) {
        this.serviceColor = serviceColor;
        this.serviceWheel = serviceWheel;
        this.serviceOptions = serviceOptions;
        this.audiFactory = audiFactory;
        this.wolkswagenFactory = wolkswagenFactory;
        this.bmwFactory = bmwFactory;
    }

    public BMW orderBMWCar(ModelOfBMW modelOfBMW, Wheel wheel, Engine engine, Color color,
                           Set<Option> options, CarBodyType carBodyType) {
        return bmwFactory.createBmwCar(modelOfBMW, wheel, engine, color, options,carBodyType);
    }

    public Audi orderAudiCar(ModelOfAudi modelOfAudi, Wheel wheel, Engine engine,
                             Color color, Set<Option> options, String design) {
        return audiFactory.createAudiCar(modelOfAudi, wheel, engine, color, options, design);
    }

    public Wolkswagen orderWolkswagenCar(ModelOfWolkswagen modelOfWolkswagen, Wheel wheel, Engine engine,
                                         Color color, Set<Option> options, boolean tintedWindow) {
        return wolkswagenFactory.createWolkswagenCar(modelOfWolkswagen, wheel, engine, color, options, tintedWindow);
    }

    public void changeColor(Car car, Color color) {

        serviceColor.changeColor(car, color);
    }
    public void changeWheels(Car car, Wheel wheel) {

        serviceWheel.changeWheels(car, wheel);
    }
    public void addOption(Car car, Option option) {
               serviceOptions.addOption(car, option);
    }
    public void deleteOption(Car car, Option option) {

        serviceOptions.deleteOption(car, option);
    }
    public void setOption(Car car, Option option) {
        serviceOptions.deleteOption(car, option);
    }

    public void printBMWFactorySettings() {
        System.out.println(bmwFactory.getConfigurationsBMW());
    }
    public void printAudiFactorySettings(){
        System.out.println(audiFactory.getConfigurationsAudi());
    }
    public void printWolkswagenFactorySettings() {
        System.out.println(wolkswagenFactory.getConfigurationsWolkswagen());
    }
}
