package java_hometasks.homework2_and_3;

public enum Month {
        JANUARY(1),
        FEBRUARY(2),
        MARCH(3),
        APRIL(4),
        MAY(5),
        JUNE(6),
        JULE(7),
        AUGUST(8),
        SEPTEMBER(9),
        OCTOBER(10),
        NOVEMBER(11),
        DECEMBER(12);

        private int number;

        Month(int i) {

            number = i;
        }

        public static String getNameOfNumbers(int number) {
            for (Month m : Month.values()) {
                if (m.number == number) {
                    return m.name();
                }
            }
            return null;
        }

        public static int getNumberByName(String name) {
            for (Month m : Month.values()) {
                if (m.name().equals(name)) {
                    return m.number;
                }
            }
            return 0;
        }
    }
