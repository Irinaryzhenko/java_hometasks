package java_hometasks.homeworks.CourseProject.CAR;

import java_hometasks.homeworks.CourseProject.CAR.carEnum.*;
import java_hometasks.homeworks.CourseProject.CAR.models.ModelOfAudi;
import java_hometasks.homeworks.CourseProject.CAR.models.ModelOfBMW;
import java_hometasks.homeworks.CourseProject.CAR.models.ModelOfWolkswagen;


import java.util.HashSet;
import java.util.Set;

public class Car {

    private final int YEAR;
    public static Wheel wheel;
    private final Engine engine;
    private static Color color;
    private Set<Option> options;

    public Car(int YEAR, Wheel wheel, Engine engine, Color color, Set<Option> options) {
        this.YEAR = YEAR;
        this.wheel = wheel;
        this.engine = engine;
        this.color = color;
        this.options = options != null ? options : new HashSet<>();

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

    public Color getColor() {
        return color;
    }

    public Set<Option> getOptions() {
        return options;
    }


    public void setColor(Color color) {

        this.color = color;
    }

    public void setOptions(Set<Option> options) {

        this.options = options;
    }


    public static class BMW extends Car {
        public static final String TO_STRING_BMW_TEMPLATE = "BMW{year: %s, " +
                "model: %s, " +
                "engineVol: %s, " +
                "color: %s, " +
                "wheelSize: %s, " +
                "options: %s, " +
                "carBodyType: %s}";
        private ModelOfBMW model;
        private static CarBodyType carBodyType;

        public BMW(int YEAR, Wheel wheel, Engine engine, Color color, Set<Option> options, ModelOfBMW model, CarBodyType carBodyType) {
            super(YEAR, wheel, engine, color, options);
            this.model = model;
            this.carBodyType = carBodyType;
        }


        public ModelOfBMW getModelOfBMW() {

            return model;
        }

        public CarBodyType getCarBodyType() {
            return carBodyType;
        }

        public void setModelOfBMW(ModelOfBMW model) {
            this.model = model;
        }

        public void setCarBodyType(CarBodyType carBodyType) {
            BMW.carBodyType = carBodyType;
        }
    }


        public static class Audi extends Car {

            public static final String TO_STRING_AUDI_TEMPLATE = "AUDI{year: %s, " +
                    "model: %s, " +
                    "engineVol: %s, " +
                    "color: %s, " +
                    "wheelSize: %s, " +
                    "options: %s, " +
                    "design: %s}";

            private final ModelOfAudi modelOfAudi;
            private static String design = "Limited edition";

            public Audi(int YEAR, Wheel wheel, Engine engine, Color color, Set<Option> options, ModelOfAudi modelOfAudi, String design) {
                super(YEAR, wheel, engine, color, options);
                this.modelOfAudi = modelOfAudi;
                this.design = design;
            }

            public ModelOfAudi getModelOfAudi() {
                return modelOfAudi;
            }

            public String getDesign() {

                return design;
            }

            public void setDesign(String design) {
                Audi.design = design;
            }
        }

            public static class Wolkswagen extends Car {
                public static final String TO_STRING_WOLKSWAGEN_TEMPLATE = "AUDI{year: %s, " +
                        "model: %s, " +
                        "engineVol: %s, " +
                        "color: %s, " +
                        "wheelSize: %s, " +
                        "options: %s, " +
                        "tintedWindows: %s}";

                private final ModelOfWolkswagen modelOfWolkswagen;

                private boolean tintedWindows;

                public Wolkswagen(int YEAR, Wheel wheel, Engine engine, Color color, Set<Option> options,
                                  ModelOfWolkswagen modelOfWolkswagen, boolean tintedWindows) {
                    super(YEAR, wheel, engine, color, options);
                    this.modelOfWolkswagen = modelOfWolkswagen;
                    this.tintedWindows = tintedWindows;
                }

                public ModelOfWolkswagen getModelOfWolkswagen() {
                    return modelOfWolkswagen;
                }

                public boolean isTintedWindows() {
                    return tintedWindows;
                }

                public void setTintedWindows(boolean tintedWindows) {

                    this.tintedWindows = tintedWindows;
                }


            }
        }

