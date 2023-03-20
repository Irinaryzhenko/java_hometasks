package java_hometasks.homeworks.Homework6Final;

public class Start {
    public static void main(String[] args) {

        Factory factory = new Factory();
        factory.start();
        Country firstCountry = new Country("Fufliandia", factory);
        Country secondCountry = new Country("Trumliandia", factory);
        firstCountry.start();
        secondCountry.start();

        while (true) {
            if (firstCountry.isInterrupted()) {
                secondCountry.interrupt();
                System.out.println("Country " + firstCountry.getCountryName() + " has " +firstCountry.getRobotsCount() + " robots and wins!");
                break;
            } else if (secondCountry.isInterrupted()) {
                firstCountry.interrupt();
                System.out.println("Country " + secondCountry.getCountryName() + " has " +secondCountry.getRobotsCount() + " robots and wins!");
                break;
            }
        }
    }
}
