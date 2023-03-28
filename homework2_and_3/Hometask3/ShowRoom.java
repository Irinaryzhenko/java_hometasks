package java_hometasks.homework2_and_3.Hometask3;

public class ShowRoom implements Service{
    Factory factory;
    ColorService colorService;
    WheelService wheelService;

    Car newCreatetdCar(Model model, Engine engine, Wheel wheel, Color color) {

    }

    private Car createCar(Model model, Engine engine, Wheel wheel, Color color) {
        return newCreatetdCar(Model model, Engine, Wheel wheel, Color color);
    }

    @Override
    public void change(Car car, Object variation) {

    }
}
