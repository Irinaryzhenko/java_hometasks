package java_hometasks.homework2;

public class Box {
    int x;
    int y;
    int z;
    Box () {

    }

    public Box(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Box(int x) {
        this.x = x;
    }

    public Box(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String displayTypeOfBox() {

       if (x == y && x == z)
            return "This is a cube";
        else if (z == 0)
            return "This is an envelope";
        else
           return "This is the usual box";

    }
}
