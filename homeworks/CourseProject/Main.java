package java_hometasks.homeworks.CourseProject;

import java_hometasks.homeworks.CourseProject.CAR.Car;
import java_hometasks.homeworks.CourseProject.CAR.carEnum.*;
import java_hometasks.homeworks.CourseProject.CAR.models.ModelOfAudi;
import java_hometasks.homeworks.CourseProject.CAR.models.ModelOfBMW;
import java_hometasks.homeworks.CourseProject.CAR.models.ModelOfWolkswagen;
import java_hometasks.homeworks.CourseProject.Factories.Factory;
import java_hometasks.homeworks.CourseProject.Storages.Storage;

import java.util.Collections;
import java.util.HashSet;

import static java_hometasks.homeworks.CourseProject.Factories.Factory.AudiFactory.design;

public class Main {
    public static void main(String[] args) {
        Service.ServiceColor serviceColor = new Service.ServiceColor(new Car(2022, Wheel.BIG,
                Engine.MEDIUM, Color.RED, Collections.singleton(Option.HEATED_SEATS)));
        Service.ServiceWheel serviceWheel = new Service.ServiceWheel(new Car(2022, Wheel.SMALL, Engine.LOW,
                Color.BLACK, Collections.singleton(Option.HEATED_SEATS)));
        Service.ServiceOptions serviceOptions = new Service.ServiceOptions();

        Factory.BmwFactory bmwFactory = new Factory.BmwFactory(Color.values(), Wheel.values(),
                Engine.values(), ModelOfBMW.values(), CarBodyType.values());

        Factory.AudiFactory audiFactory = new Factory.AudiFactory(Color.values(), Wheel.values(),
                Engine.values(), ModelOfAudi.values(), design);


        Factory.WolkswagenFactory wolkswagenFactory = new Factory.WolkswagenFactory(Color.values(), Wheel.values(),
                Engine.values(), ModelOfWolkswagen.values(), true);
        ShowRoom showroom = new ShowRoom(serviceColor, serviceWheel, serviceOptions, audiFactory, wolkswagenFactory, bmwFactory);

        showroom.printBMWFactorySettings();
        showroom.printAudiFactorySettings();
        showroom.printWolkswagenFactorySettings();

        Car.BMW carBmw = showroom.orderBMWCar(ModelOfBMW.X3, Wheel.SMALL, Engine.LOW, Color.BLACK,
                new HashSet<>(), CarBodyType.CABRIOLET);

        Car.Audi audiCar = showroom.orderAudiCar(ModelOfAudi.Q7, Wheel.SMALL, Engine.HIGHT, Color.GRAY, new HashSet<>(), design);
        Car.Wolkswagen wolkswagenCar = showroom.orderWolkswagenCar(ModelOfWolkswagen.PASSAT, Wheel.BIG,
                Engine.HIGHT, Color.GRAY, new HashSet<>(),true);

        serviceColor.changeColor(audiCar, Color.RED);
        System.out.println(audiCar.getColor());

        serviceWheel.changeWheels(wolkswagenCar, Wheel.MEDIUM);
        System.out.println(wolkswagenCar.getWheel());

    }
}


