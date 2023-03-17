package java_hometasks.homeworks.Homework6;

public class StartWar {
    public static void main(String[] args) throws Exception {
        Factory factory = new Factory();
        CountryInWars firstCountry = new CountryInWars("First great country");
        CountryInWars secondCountry = new CountryInWars("Second wonderful country");
        firstCountry.start();
        secondCountry.start();
        while (firstCountry.getRobotsCount() < 5 && secondCountry.getRobotsCount() < 5) {
            Thread.sleep(1000);

            Parts part = factory.producePart();
            firstCountry.addPartOfRobot(part);
            secondCountry.addPartOfRobot(part);
        }
        System.out.println("First country has " + firstCountry.getRobotsCount() + " robots.");
        System.out.println("Second country has " + secondCountry.getRobotsCount() + " robots.");
        if (firstCountry.getRobotsCount() > secondCountry.getRobotsCount()) {
            System.out.println("First great country wins!");
        } else if (firstCountry.getRobotsCount() < secondCountry.getRobotsCount()) {
            System.out.println("Second country wins!");
        } else {
            System.out.println("It's a tie!");
        }
        firstCountry.interrupt();
        secondCountry.interrupt();
    }
}
