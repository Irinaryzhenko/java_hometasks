package java_hometasks.homeworks.Homework6Final;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static java.lang.System.out;

public class Country extends Thread{

    private final String countryName;
    private volatile boolean execute = true;
    private final List<Robot> robots = new ArrayList<>();
    private Factory factory;
    private Set<Parts> parts = new HashSet<>();

    public Country(String countryName, Factory factory) {
        this.countryName = countryName;
        this.factory = factory;
    }

       public String getCountryName() {
        return countryName;
    }

    public int getRobotsCount() {
        return robots.size();
    }

    public Set<Parts> getParts() {
        return parts;
    }

    public void setParts(Set<Parts> parts) {
        this.parts = parts;
    }

    @Override
    public void run() {
        while (robots.size() < 20 && !isInterrupted()) {
            factory.getPartsForCountry(this);
            if (parts.size() == 6) {
                out.println(countryName + " has already created a new robot.");
                robots.add(new Robot(parts));
                parts.clear();
                out.println(this.countryName + " has " + getRobotsCount() + " robots by now");
            }
        }
        this.interrupt();
        factory.setExecute(false);
        out.println("In the end " + getCountryName() + " stopped war.");
    }
}
