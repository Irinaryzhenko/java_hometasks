package java_hometasks.homeworks.CourseProject.Storages;

import java_hometasks.homeworks.CourseProject.CAR.Car;
import java_hometasks.homeworks.CourseProject.CAR.carEnum.CarBodyType;
import java_hometasks.homeworks.CourseProject.CAR.carEnum.Color;
import java_hometasks.homeworks.CourseProject.CAR.carEnum.Engine;
import java_hometasks.homeworks.CourseProject.CAR.carEnum.Wheel;
import java_hometasks.homeworks.CourseProject.CAR.models.ModelOfAudi;
import java_hometasks.homeworks.CourseProject.CAR.models.ModelOfBMW;
import java_hometasks.homeworks.CourseProject.CAR.models.ModelOfWolkswagen;


import java.util.ArrayList;
import java.util.List;

public class Storage {
    private List<Car.BMW> carsBmw = new ArrayList<>();
    private List<Car.Audi> carsAudi = new ArrayList<>();
    private List<Car.Wolkswagen> carsWolkswagen = new ArrayList<>();

    public void addCarToStorage(Car.Audi carAudi) {

        carsAudi.add(carAudi);
    }
    public void addCarToStorage(Car.BMW carBmw) {

        carsBmw.add(carBmw);
    }
    public void addCarToStorage(Car.Wolkswagen carWolkswagen) {

        carsWolkswagen.add(carWolkswagen);
    }


    public Car.BMW getBMWCarFromStorage(ModelOfBMW modelOfBMW, Wheel wheel, Engine engine, Color color, CarBodyType carBodyType) {
      Car.BMW car = null;
        int index = 0;
        for (int i = 0; i < carsBmw.size(); i++) {
            Car.BMW temp = carsBmw.get(i);
            if (temp.getModelOfBMW() == modelOfBMW && temp.getEngine() == engine) {
                if (car == null) {
                    car = temp;
                    index = i;
                    continue;
                }
                if (temp.getColor() == color && car.getColor() != color) {
                    car = temp;
                    index = i;
                    continue;
                }
                if (temp.getWheel() == wheel && car.getWheel() != wheel) {
                    car = temp;
                    index = i;
                }
                if (temp.getCarBodyType() == carBodyType && car.getCarBodyType() != carBodyType){
                    car = temp;
                    index = i;
                }
            }
        }
        if (car != null) {
            carsBmw.remove(index);
        }
        return car;
    }
    public Car.Audi getAudiCarFromStorage (ModelOfAudi modelOfAudi, Wheel wheel, Engine engine, Color color, String design) {
        Car.Audi car = null;
        int index = 0;
        for (int i = 0; i < carsAudi.size(); i++) {
            Car.Audi temp = carsAudi.get(i);
            if (temp.getModelOfAudi() == modelOfAudi && temp.getEngine() == engine) {
                if (car == null) {
                    car = temp;
                    index = i;
                    continue;
                }
                if (temp.getColor() == color && car.getColor() != color) {
                    car = temp;
                    index = i;
                    continue;
                }
                if (temp.getWheel() == wheel && car.getWheel() != wheel) {
                    car = temp;
                    index = i;
                }
                if (temp.getDesign() == design && car.getDesign() != design){
                    car = temp;
                    index = i;
                }
            }
        }
        if (car != null) {
            carsAudi.remove(index);
        }
        return car;
    }

    public Car.Wolkswagen getWolkswagenCarFromStorage (ModelOfWolkswagen modelOfWolkswagen, Wheel wheel, Engine engine,
                                                       Color color, boolean tintedWindow) {
        Car.Wolkswagen car = null;
        int index = 0;
        for (int i = 0; i < carsWolkswagen.size(); i++) {
            Car.Wolkswagen temp = carsWolkswagen.get(i);
            if (temp.getModelOfWolkswagen() == modelOfWolkswagen && temp.getEngine() == engine) {
                if (car == null) {
                    car = temp;
                    index = i;
                    continue;
                }
                if (temp.getColor() == color && car.getColor() != color) {
                    car = temp;
                    index = i;
                    continue;
                }
                if (temp.getWheel() == wheel && car.getWheel() != wheel) {
                    car = temp;
                    index = i;
                }
                if (temp.isTintedWindows() == tintedWindow && car.isTintedWindows() != tintedWindow){
                    car = temp;
                    index = i;
                }
            }
        }
        if (car != null) {
            carsWolkswagen.remove(index);
        }
        return car;
    }

}


