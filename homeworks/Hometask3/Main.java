package java_hometasks.homeworks.Hometask3;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();
        Factory factory = new Factory(Model.values(), Color.values(), Wheel.values(), Engine.values());
        ShowRoom showroom = new ShowRoom(service, factory);

        showroom.printFactorySettings();

        Car car = showroom.orderCar(
                Model.AUDI,
                Wheel.BIG,
                Engine.HIGHT,
                Color.BLACK,
                new HashSet<>()
                        );
    }
}

