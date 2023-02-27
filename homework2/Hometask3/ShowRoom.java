package java_hometasks.homework2.Hometask3;

public class ShowRoom implements Service{
    Factory factory;
    ColorService colorService;
    WheelService wheelService;

    Car createCar(Model model, Engine engine, Wheel wheel, Color color) {
        Car newCreatedCar;
        return newCreatedCar(model, engine, wheel, color);
    }

    @Override
    public void change(Car car, Object variation) {

    }
}
