package java_hometasks.homeworks.Homework6;

public class StartWar {
    public static void main(String[] args) throws InterruptedException {
        Factory factory = new Factory();
        CountryInWars firstCountry = new CountryInWars("First great country");
        CountryInWars secondCountry = new CountryInWars("Second wonderful country");
        firstCountry.start();
        secondCountry.start();
        int limit = 20;

        while (true) {
            Thread.sleep(5000);
            Part part1 = factory.producePart();
            Part part2 = factory.producePart();
            firstCountry.addPartOfRobot(part1);
            secondCountry.addPartOfRobot(part2);
            if (firstCountry.getRobotsCount() >= limit) {
                System.out.println("First country wins!");
                firstCountry.interrupt();
                secondCountry.interrupt();
                break;

            } else if (secondCountry.getRobotsCount() >= limit) {
                System.out.println("Country 2 wins!");
                firstCountry.interrupt();
                secondCountry.interrupt();
                break;
            }
        }
        System.out.println("First country has " + firstCountry.getRobotsCount() + " robots.");
        System.out.println("Second country has " + secondCountry.getRobotsCount() + " robots.");

    }
}
