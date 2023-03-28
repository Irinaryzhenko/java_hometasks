package java_hometasks.homeworks.homework5.task9_and_10;

import java.io.Serializable;

public class Box implements Serializable, Comparable<Box>{
    private int x;
    private int y;
    private int z;

    public Box(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public int volume() {

        return this.z * this.y * this.x;
    }



    @Override
    public String toString() {
        return "Box{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    @Override
    public int compareTo(Box box) {
        return 0;
    }
}
