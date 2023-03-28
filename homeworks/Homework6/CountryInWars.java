package java_hometasks.homeworks.Homework6;

import java.util.ArrayList;
import java.util.List;

public class CountryInWars extends Thread {
    private String name;
    private List<Part> parts = new ArrayList<>();
    private List<NewRobot> robots = new ArrayList<>();
    public CountryInWars(String name) {
        this.name = name;
    }
    public synchronized void addPartOfRobot(Part part) {
        parts.add(part);
        System.out.println(name + " received a " + part.getName() + " part.");
        notifyAll();
    }
    public synchronized int getRobotsCount() {
        return robots.size();
    }    private synchronized void createRobot() throws InterruptedException {
        while (parts.size() < 6) {
            wait();
        }
        NewRobot robot = new NewRobot(parts.subList(0, 6));
        robots.add(robot);
        parts.subList(0, 6).clear();
        System.out.println(name + " created a new robot.");
    }
    @Override
    public void run() {
        try {
            while (!isInterrupted() && robots.size() < 20) {
                createRobot();
            }
        } catch (InterruptedException e) {

        }
    }
}
