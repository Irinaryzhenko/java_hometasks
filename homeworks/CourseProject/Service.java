package java_hometasks.homeworks.CourseProject;

import java_hometasks.homeworks.CourseProject.CAR.Car;
import java_hometasks.homeworks.CourseProject.CAR.carEnum.Color;
import java_hometasks.homeworks.CourseProject.CAR.carEnum.Engine;
import java_hometasks.homeworks.CourseProject.CAR.carEnum.Option;
import java_hometasks.homeworks.CourseProject.CAR.carEnum.Wheel;

import java.util.Collections;
import java.util.Set;

public class Service {
    private static Car car = new Car(2022, Wheel.BIG, Engine.MEDIUM, Color.RED, Collections.singleton(Option.AUTOSTART));

    public static class ServiceColor extends Service{

        public ServiceColor(Car car) {
        }

        public void changeColor(Car car, Color color)   {
            if (car != null && color != null && !color.equals(car.getColor())) {
            car.setColor(color);
        }
        }
    }

    public static class ServiceWheel extends Service{

        public ServiceWheel(Car car) {
        }
        public void changeWheels(Car car, Wheel wheel) {
        if (car != null && wheel != null && !wheel.equals(car.getWheel())) {
            car.setWheel(wheel);
        }
    }
    }

    public static class ServiceOptions extends Service{


        public ServiceOptions() {
        }
        public void addOption(Car car, Option option) {
        if (car != null && option != null) {
            car.getOptions().add(option);
        }
    }

    public void deleteOption(Car car, Option option) {
        if (car != null && option != null) {
            car.getOptions().remove(option);
        }
    }
    public void setOptions(Car car, Set<Option> options) {
        if (car != null && options != null) {
            car.setOptions(options);
        }
    }
    }
//    public void changeColor(Car car, Color color) {
//        if (car != null && color != null && !color.equals(car.getColor())) {
//            car.setColor(color);
//        }
//    }
//
//    public void changeWheels(Car.BMW car, Wheel wheel) {
//        if (car != null && wheel != null && !wheel.equals(car.getWheel())) {
//            car.setWheel(wheel);
//        }
//    }
//
//    public void addOption(Car.BMW car, Option option) {
//        if (car != null && option != null) {
//            car.getOptions().add(option);
//        }
//    }
//
//    public void deleteOption(Car car, Option option) {
//        if (car != null && option != null) {
//            car.getOptions().remove(option);
//        }
//    }
//    public void setOptions(Car car, Set<Option> options) {
//        if (car != null && options != null) {
//            car.setOptions(options);
//        }
//    }
}

