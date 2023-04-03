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
import java_hometasks.homeworks.CourseProject.Storages.Storage;

import java.util.Collections;
import java.util.HashSet;

import static java_hometasks.homeworks.CourseProject.Factories.AudiFactory.design;


public class Main {
    public static void main(String[] args) {
        Service.ServiceColor serviceColor = new Service.ServiceColor(new Car(2022, Wheel.BIG,
                Engine.MEDIUM, Color.RED, Collections.singleton(Option.HEATED_SEATS)));
        Service.ServiceWheel serviceWheel = new Service.ServiceWheel(new Car(2022, Wheel.SMALL, Engine.LOW,
                Color.BLACK, Collections.singleton(Option.HEATED_SEATS)));
        Service.ServiceOptions serviceOptions = new Service.ServiceOptions();

        BMWFactory bmwFactory = new BMWFactory(Color.values(), Wheel.values(),
                Engine.values(), ModelOfBMW.values(), CarBodyType.values());

        AudiFactory audiFactory = new AudiFactory(Color.values(), Wheel.values(),
                Engine.values(), ModelOfAudi.values(), design);


        WolkswagenFactory wolkswagenFactory = new WolkswagenFactory(Color.values(), Wheel.values(),
                Engine.values(), ModelOfWolkswagen.values(), true);
        ShowRoom showroom = new ShowRoom(serviceColor, serviceWheel, serviceOptions, audiFactory, wolkswagenFactory, bmwFactory);

        showroom.printBMWFactorySettings();
        showroom.printAudiFactorySettings();
        showroom.printWolkswagenFactorySettings();

        BMW carBmw = showroom.orderBMWCar(ModelOfBMW.X3, Wheel.SMALL, Engine.LOW, Color.BLACK,
                new HashSet<>(), CarBodyType.CABRIOLET);

        Audi audiCar = showroom.orderAudiCar(ModelOfAudi.Q7, Wheel.SMALL, Engine.HIGHT, Color.GRAY, new HashSet<>(), design);
        Wolkswagen wolkswagenCar = showroom.orderWolkswagenCar(ModelOfWolkswagen.PASSAT, Wheel.BIG,
                Engine.HIGHT, Color.GRAY, new HashSet<>(),true);

        serviceColor.changeColor(audiCar, Color.RED);
        System.out.println(audiCar.getColor());

        serviceWheel.changeWheels(wolkswagenCar, Wheel.MEDIUM);
        System.out.println(wolkswagenCar.getWheel());

        showroom.addOption(audiCar, Option.AUTOSTART);
        System.out.println(audiCar.getModelOfAudi());
        System.out.println(audiCar.getDesign());
        System.out.println(audiCar.getOptions());
        showroom.addOption(audiCar,Option.AUTO_LINE_ASSISTANT);
        System.out.println(audiCar.getOptions());

    }
}


