package java_hometasks.homeworks.HW6;

public class Start {
    public static void main(String[] args) throws Exception {

        Factory factory = new Factory();

        factory.start();

        Country firstCountry = new Country("Fufliandia");

        firstCountry.setFactory(factory);

        Country secondCountry = new Country("Trumliandia");

        secondCountry.setFactory(factory);

        firstCountry.start();
        secondCountry.start();

        while (!firstCountry.isInterrupted() && !secondCountry.isInterrupted()) {

        }

        if (firstCountry.getRobotsCount() > secondCountry.getRobotsCount()) {
            System.out.println("Country " + firstCountry.getCountryName() + " has " +firstCountry.getRobotsCount() + " robots and wins!");
        } else if (firstCountry.getRobotsCount() < secondCountry.getRobotsCount()) {
            System.out.println("Country " + secondCountry.getCountryName() + " has " +secondCountry.getRobotsCount() + " robots and wins!");
        }

        firstCountry.stop();
        secondCountry.stop();
        factory.stop();
    }

}
