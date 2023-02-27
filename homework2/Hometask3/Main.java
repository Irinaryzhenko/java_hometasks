package java_hometasks.homework2.Hometask3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Car newColoredCar = new Car(Model.SHARAN, Wheel.SIZE3, Engine.ENGINE1, Color.BLACK);
        newColoredCar.setColor(Color.RED);
        System.out.println(newColoredCar.getCarInfo());

        newColoredCar.setWheel(Wheel.SIZE1);
        System.out.println(newColoredCar.getCarInfo());

        List <Option> option = new ArrayList<>();
        option.add(Option.AUTOSTART);
        option.add(Option.HEATED_SEATS);
        System.out.println(option);

























    }


}
