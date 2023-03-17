package java_hometasks.homeworks.Homework6;

import java.util.ArrayList;
import java.util.List;

public class CountryInWars extends Thread{
    private String countryName;
    private List<Parts> parts = new ArrayList<>();
    private List<NewRobot> createdRobots = new ArrayList<NewRobot>();

    public CountryInWars(String countryName) {

        this.countryName = countryName;
    }
    public synchronized void addPartOfRobot(Parts part) {
        parts.add(part);
        System.out.println(countryName + " has get a " + part.getName() + " of new robot.");
        notifyAll();
    }
    public synchronized int getRobotsCount() {
        return createdRobots.size();
    }
    private synchronized void createRobot() throws InterruptedException {
    while (parts.size() < 6) {
        wait();
    }
        NewRobot robot = new NewRobot(parts.subList(0, 6));
    createdRobots.add(robot);
    parts.subList(0, 6).clear();
    System.out.println(countryName + " has already created a new robot.");
    }


    @Override
    public void run() {
        try {
            while (!isInterrupted() && createdRobots.size() < 20) {
                createRobot();
            }
        } catch (InterruptedException e) {

        }

    }
}
