package java_hometasks.homeworks.Homework6;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Factory {
    private Random random = new Random();
    private Set<String> kindOfParts = new HashSet<>();
    public Part producePart() {
        kindOfParts.add("left arm");
        kindOfParts.add("right arm");
        kindOfParts.add("left leg");
        kindOfParts.add("right leg");
        kindOfParts.add("body");
        kindOfParts.add("head");
        int partNumber = random.nextInt(6) + 1;
        if (partNumber < 1 || partNumber > kindOfParts.size()) {
            return null;
        }
        String partType = (String) kindOfParts.toArray()[partNumber - 1];
        return new Part(kindOfParts.toString());
    }
}