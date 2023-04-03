package java_hometasks.homeworks.CourseProject.Storages;

import java_hometasks.homeworks.CourseProject.CAR.Audi;
import java_hometasks.homeworks.CourseProject.CAR.BMW;
import java_hometasks.homeworks.CourseProject.CAR.Car;
import java_hometasks.homeworks.CourseProject.CAR.Wolkswagen;
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
    private List<BMW> carsBmw = new ArrayList<>();
    private List<Audi> carsAudi = new ArrayList<>();
    private List<Wolkswagen> carsWolkswagen = new ArrayList<>();

    public void addCarToStorage(Audi carAudi) {

        carsAudi.add(carAudi);
    }
    public void addCarToStorage(BMW carBmw) {

        carsBmw.add(carBmw);
    }
    public void addCarToStorage(Wolkswagen carWolkswagen) {

        carsWolkswagen.add(carWolkswagen);
    }


    public synchronized BMW getBMWCarFromStorage(ModelOfBMW modelOfBMW, Wheel wheel, Engine engine, Color color, CarBodyType carBodyType) {
      BMW car = null;
        int index = 0;
        for (int i = 0; i < carsBmw.size(); i++) {
            BMW temp = carsBmw.get(i);
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
    public synchronized Audi getAudiCarFromStorage (ModelOfAudi modelOfAudi, Wheel wheel, Engine engine, Color color, String design) {
        Audi car = null;
        int index = 0;
        for (int i = 0; i < carsAudi.size(); i++) {
            Audi temp = carsAudi.get(i);
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

    public synchronized Wolkswagen getWolkswagenCarFromStorage (ModelOfWolkswagen modelOfWolkswagen, Wheel wheel, Engine engine,
                                                                Color color, boolean tintedWindow) {
        Wolkswagen car = null;
        int index = 0;
        for (int i = 0; i < carsWolkswagen.size(); i++) {
            Wolkswagen temp = carsWolkswagen.get(i);
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


