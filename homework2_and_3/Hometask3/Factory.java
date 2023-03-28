package java_hometasks.homework2_and_3.Hometask3;

import java.util.ArrayList;
import java.util.List;

public class Factory <T> {

    List<Model> carModels;
    List <Engine> engines;
    List <Color> colors;
    List <Wheel> wheels;
    FactoryStock stockCar;

    public Factory(List<Model> carModels, List<Engine> engines, List<Color> colors, List<Wheel> wheels) {
        this.carModels = carModels;
        this.engines = engines;
        this.colors = colors;
        this.wheels = wheels;

    }

    public static void main(String[] args) {
        List<Model> carModels = new ArrayList<>();
        carModels.add(0, Model.GOLF);
        carModels.add(1, Model.POlO);

        List<Engine> engines = new ArrayList<>();
        engines.add(0, Engine.ENGINE1);
        engines.add(1, Engine.ENGINE2);
        engines.add(2, Engine.ENGINE3);

        List<Color> colors = new ArrayList<>();
        colors.add(0, Color.BLACK);
        colors.add(1, Color.RED);

        List<Wheel> wheels = new ArrayList<>();
        wheels.add(0, Wheel.SIZE3);
        wheels.add(1, Wheel.SIZE2);


        System.out.println("Available models are: " + carModels);
        System.out.println("Available Engine Volumes are: " + engines);
        System.out.println("Available wheel sizes are " + wheels);
        System.out.println("Available colors to paint the cars are " + colors);
    }



}










