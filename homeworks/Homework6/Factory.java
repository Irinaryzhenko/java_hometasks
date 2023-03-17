package java_hometasks.homeworks.Homework6;

import java.util.Random;

public class Factory {
    private Random random = new Random();

    public Parts producePart() {
        int numOfPart = random.nextInt(6) + 1;
        switch (numOfPart) {
            case 1:
                return new Parts("Left arm");
            case 2:
                return new Parts("Right arm");
            case 3:
                return new Parts("Left leg");
            case 4:
                return new Parts("Right leg");
            case 5:
                return new Parts("Body");
            case 6:
                return new Parts("Head");
            default:
                return null;
        }
    }
}
