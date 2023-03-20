package java_hometasks.homeworks.Homework6Final;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

import static java.lang.System.out;
public class Factory extends Thread {
    private final Random random = new Random();
    private volatile boolean execute = true;

    public void setExecute(boolean execute) {
        this.execute = execute;
    }

    private final List<Parts> partsList = new ArrayList<>();

    public synchronized void getPartsForCountry(Country country) {
        Parts temp = null;
        Set<Parts> countryParts = country.getParts();

        synchronized (partsList) {
            for (Parts part : partsList) {
                if (!countryParts.contains(part)) {
                    countryParts.add(part);
                    temp = part;
                    country.setParts(countryParts);
                    break;
                }
            }

            if (temp != null) {
                out.println("Country " + country.getCountryName() + " take " + temp);
                removePart(temp);
            }
        }
    }

    private void removePart(Parts parts) {
        synchronized (partsList) {
            partsList.remove(parts);
            //out.println("Factory removed - " + parts.getName());
        }
    }

    private void addPart(Parts parts) {
        synchronized (partsList) {
            partsList.add(parts);
           // out.println("Factory added - " + parts.getName());
        }
    }

    @Override
    public void run() {
        while (execute) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {

            }
            int numOfPart = random.nextInt(6) + 1;
            switch (numOfPart) {
                case 1:
                    addPart(new Parts("Left arm"));
                    break;
                case 2:
                    addPart(new Parts("Right arm"));
                    break;
                case 3:
                    addPart(new Parts("Left leg"));
                    break;
                case 4:
                    addPart(new Parts("Right leg"));
                    break;
                case 5:
                    addPart(new Parts("Body"));
                    break;
                case 6:
                    addPart(new Parts("Head"));
                    break;
            }

        }
        out.println("Factory stopped");
    }
}
