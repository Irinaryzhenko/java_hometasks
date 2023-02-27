package java_hometasks.homework2.Hometask3;

import java.util.ArrayList;
import java.util.List;

public class Car {

    private final Model model;
    private Wheel wheel;
    private final Engine engine;
    private Color color;
    private String carInfo;
    List <Option> option;

    Car (Model model, Wheel wheel, Engine engine, Color color) {
        this.color = color;
        this.model = model;
        this.engine = engine;
        this.wheel = wheel;

    }

    public String getCarInfo() {
        String carInfo = "Model: " + model.modelName + "; Wheel: "
                + wheel.wheelSize + "; Engine: "
                + engine.engineName + "; Color: "
                + color.colorName;
        return this.carInfo = carInfo;
    }

    public Color getColor() {

        return color;
    }

    public void setColor(Color color) {

        this.color = color;
    }

    public Model getModel() {

        return model;
    }

    public Wheel getWheel() {

        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public Engine getEngine() {

        return engine;
    }
      public List<Option> getOption() {
        return option;
    }



     }







