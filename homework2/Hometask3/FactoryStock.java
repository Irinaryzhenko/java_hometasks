package java_hometasks.homework2.Hometask3;

import java.util.List;

public class FactoryStock {
    List<Car> cars;

   public Car addCar(Car car) {
       return car;

   }
   public Car takeCar (Car car) {

       return car;
   }
   public FactoryStock showFactoryStock(List<Car> cars) {
       return null;
   }

    public List<Car> getCars() {

       return cars;
    }

    FactoryStock(){

   }
}
