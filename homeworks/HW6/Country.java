package java_hometasks.homeworks.HW6;

import java.util.*;

import static java.lang.System.out;

public class Country extends Thread {
    private final String countryName;
    private final List<Robot> robots = new ArrayList<>();
    private Factory factory;
    private Set<Parts> parts = new HashSet<>();

    public Country(String countryName) {
        this.countryName = countryName;
    }

    public void setFactory(Factory factory) {
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

        while (robots.size() < 20) {

            factory.getPartsForCountry(this);

            if (parts.size() == 6) {
                out.println(countryName + " has already created a new robot.");
                robots.add(new Robot(parts));
                parts.clear();
                out.println("Warning " + this.countryName + " has " + getRobotsCount() + " robot !!!");
            }
        }

        this.interrupt();
    }
}

