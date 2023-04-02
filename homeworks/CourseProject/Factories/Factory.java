package java_hometasks.homeworks.CourseProject.Factories;

import java_hometasks.homeworks.CourseProject.CAR.Car;
import java_hometasks.homeworks.CourseProject.CAR.carEnum.*;
import java_hometasks.homeworks.CourseProject.CAR.models.ModelOfAudi;
import java_hometasks.homeworks.CourseProject.CAR.models.ModelOfBMW;
import java_hometasks.homeworks.CourseProject.CAR.models.ModelOfWolkswagen;
import java_hometasks.homeworks.CourseProject.Storages.Storage;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static java.lang.String.format;
import static java_hometasks.homeworks.CourseProject.CAR.Car.wheel;

public class Factory {
    private static final int YEAR = 2022;

    private static Color[] colors;
    private static  Wheel[] wheels;
    private static Engine[] engines;
    private Storage storage;

    public Factory(Color[] colors, Wheel[] wheels, Engine[] engines) {
        this.colors = colors;
        this.wheels = wheels;
        this.engines = engines;
        this.storage = new Storage();
    }

    public static class BmwFactory extends Factory {
        private final ModelOfBMW[] modelsOfBmw;
        private CarBodyType[] carBodyTypies;
        private Storage bmwStorage;

        public BmwFactory(Color[] colors, Wheel[] wheels, Engine[] engines, ModelOfBMW[] modelsOfBmw, CarBodyType[] carBodyTypies) {
            super(colors, wheels, engines);
            this.modelsOfBmw = modelsOfBmw;
            this.carBodyTypies = carBodyTypies;
            this.bmwStorage = new Storage();
            fillBMWStorageWithCars();
        }


        public Car.BMW createBmwCar(ModelOfBMW modelOfBMW, Wheel wheel, Engine engine, Color color,
                                    Set<Option> options, CarBodyType carBodyType) {
            Car.BMW carBmw = bmwStorage.getBMWCarFromStorage (modelOfBMW, wheel, engine, color,carBodyType);
            if (carBmw != null) {
                if (carBmw.getColor() != color) {
                    carBmw.setColor(color);
                }
                if (carBmw.getWheel() != wheel) {
                    carBmw.setWheel(wheel);
                }
                if (carBmw.getCarBodyType() != carBodyType) {
                    carBmw.setCarBodyType(carBodyType);
                }
                // Add options check if needed.
                carBmw.setOptions(options);
                return carBmw;
            }
            return new Car.BMW(YEAR, wheel, engine, color, options, modelOfBMW, carBodyType);
        }

        public String getConfigurationsBMW() {
            return format(
                    "Bmw Factory can produce: colors: %s, models: %s, wheels: %s, engines: %s, carBodyTypies: %s",
                    Arrays.toString(colors),
                    Arrays.toString(modelsOfBmw),
                    Arrays.toString(wheels),
                    Arrays.toString(engines),
                    Arrays.toString(carBodyTypies)
            );

        }

        private void fillBMWStorageWithCars() {
            // Any custom logic about creating initial cars.
            Car.BMW carBmw = new Car.BMW(YEAR,  Wheel.BIG, Engine.HIGHT,
                    Color.BLACK, new HashSet<>(), ModelOfBMW.X5, CarBodyType.COUPE);
            this.bmwStorage.addCarToStorage(carBmw);
            Set<Option> options = new HashSet<>();
            options.add(Option.AUTOSTART);
            carBmw = new Car.BMW(YEAR, Wheel.BIG, Engine.HIGHT, Color.RED, options,
                    ModelOfBMW.X6, CarBodyType.CABRIOLET);
            this.bmwStorage.addCarToStorage(carBmw);

        }
    }
    public static class AudiFactory extends Factory {
        private final ModelOfAudi[] modelOfAudis;
        public static String design = "Limited edition";
        private Storage audiStorage;

        public AudiFactory(Color[] colors, Wheel[] wheels, Engine[] engines, ModelOfAudi[] modelOfAudis, String design) {
            super(colors, wheels, engines);
            this.modelOfAudis = modelOfAudis;
            this.design = design;
            this.audiStorage = new Storage();
            fillAudiStorageWithCars();
        }

        public Car.Audi createAudiCar(ModelOfAudi modelOfAudi, Wheel wheel, Engine engine,
                                      Color color, Set<Option> options, String design) {
            Car.Audi carAudi = audiStorage.getAudiCarFromStorage(modelOfAudi, wheel, engine, color, design);
            if (carAudi != null) {
                if (carAudi.getColor() != color) {
                    carAudi.setColor(color);
                }
                if (carAudi.getWheel() != wheel) {
                    carAudi.setWheel(wheel);
                }
                if (carAudi.getDesign() != design) {
                    carAudi.setDesign(design);
                }
                // Add options check if needed.
                carAudi.setOptions(options);
                return carAudi;
            }
            return new Car.Audi(YEAR, wheel, engine, color, options, modelOfAudi, design);
        }

        public String getConfigurationsAudi() {
            return format(
                    "Audi Factory can produce: colors: %s, models: %s, wheels: %s, engines: %s, design: %s",
                    Arrays.toString(colors),
                    Arrays.toString(modelOfAudis),
                    Arrays.toString(wheels),
                    Arrays.toString(engines),
                    design
            );

        }

        private void fillAudiStorageWithCars() {
            // Any custom logic about creating initial cars.
            Car.Audi carAudi = new Car.Audi(YEAR, Wheel.BIG,
                    Engine.HIGHT, Color.BLACK,
                    new HashSet<>(), ModelOfAudi.Q7, design.toString());
            this.audiStorage.addCarToStorage(carAudi);
            Set<Option> options = new HashSet<>();
            options.add(Option.AUTOSTART);
            carAudi = new Car.Audi(YEAR, Wheel.BIG, Engine.HIGHT, Color.RED, options,
                    ModelOfAudi.Q7, design.toString());
            this.audiStorage.addCarToStorage(carAudi);

        }
    }
        public static class WolkswagenFactory extends Factory {
            private final ModelOfWolkswagen[] modelOfWolkswagens;
            private boolean tintedWindows;
            private Storage wolkswagenStorage;

            public WolkswagenFactory(Color[] colors, Wheel[] wheels, Engine[] engines,
                                     ModelOfWolkswagen[] modelOfWolkswagens, boolean tintedWindows) {
                super(colors, wheels, engines);
                this.modelOfWolkswagens = modelOfWolkswagens;
                this.tintedWindows = tintedWindows;
                this.wolkswagenStorage = new Storage();
                fillWolkswagenStorageWithCars();
            }

            public Car.Wolkswagen createWolkswagenCar(ModelOfWolkswagen modelOfWolkswagen, Wheel wheel, Engine engine,
                                                      Color color, Set<Option> options, boolean tintedWindows) {
                Car.Wolkswagen carWolkswagen = wolkswagenStorage.getWolkswagenCarFromStorage(modelOfWolkswagen, wheel,
                        engine, color, tintedWindows);
                if (carWolkswagen != null) {
                    if (carWolkswagen.getColor() != color) {
                        carWolkswagen.setColor(color);
                    }
                    if (carWolkswagen.getWheel() != wheel) {
                        carWolkswagen.setWheel(wheel);
                    }
                    if (!carWolkswagen.isTintedWindows()) {
                        carWolkswagen.setTintedWindows(tintedWindows);
                    }
                    // Add options check if needed.
                    carWolkswagen.setOptions(options);
                    return carWolkswagen;
                }
                return new Car.Wolkswagen(YEAR, wheel, engine, color, options, modelOfWolkswagen, tintedWindows);
            }

            public String getConfigurationsWolkswagen() {
                return format(
                        "Wolkswagen Factory can produce: colors: %s, models: %s, wheels: %s, engines: %s, tinted windows: %s",
                        Arrays.toString(colors),
                        Arrays.toString(modelOfWolkswagens),
                        Arrays.toString(wheels),
                        Arrays.toString(engines),
                        tintedWindows
                );


            }

            private void fillWolkswagenStorageWithCars() {
                // Any custom logic about creating initial cars.
                Car.Wolkswagen carWolkswagen = new Car.Wolkswagen(YEAR,  Wheel.BIG,
                        Engine.HIGHT, Color.BLACK,
                        new HashSet<>(), ModelOfWolkswagen.TIGUAN, tintedWindows);
                this.wolkswagenStorage.addCarToStorage(carWolkswagen);
                Set<Option> options = new HashSet<>();
                options.add(Option.AUTOSTART);
                carWolkswagen = new Car.Wolkswagen(YEAR, Wheel.BIG, Engine.HIGHT, Color.RED, options,
                        ModelOfWolkswagen.SHARAN, tintedWindows);
                this.wolkswagenStorage.addCarToStorage(carWolkswagen);

            }
        }
        }















