package java_hometasks.homeworks.Hometask3;

import java.util.Set;

public class ShowRoom {
    private final Service service;
    private  final Factory factory;

    public ShowRoom (Service service, Factory factory) {
        this.service = service;
        this.factory = factory;
    }

    public Car orderCar(Model model, Wheel wheel, Engine engine, Color color, Set<Option> options) {
        return factory.createCar(model, wheel, engine, color, options);
    }
    public void changeColor(Car car, Color color) {
        service.changeColor(car, color);
    }
    public void changeWheels(Car car, Wheel wheel) {
        service.changeWheels(car, wheel);
    }
    public void addOption(Car car, Option option) {
        service.addOption(car, option);
    }
    public void deleteOption(Car car, Option option) {
        service.deleteOption(car, option);
    }
    public void setOption(Car car, Option option) {
        service.deleteOption(car, option);
    }
    public void printFactorySettings() {
        System.out.println(factory.getConfigurations());
    }
}
