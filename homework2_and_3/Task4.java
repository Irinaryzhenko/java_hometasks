package java_hometasks.homework2_and_3;

public class Task4 {
    public static void main(String[] args) {
        String brand = "AUDI";
        String color = "RED";
        Car car = new Car(Car.Brand.valueOf(brand), Car.Color.valueOf(color));
        car.setColor(color);

        System.out.println(car);


    }
}
