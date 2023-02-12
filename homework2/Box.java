package java_hometasks.homework2;

public class Box {
   private int x;
    private int y;
    private int z;

    private BoxType type;

    public Box (int x, int y) {
        this.x = x;
        this.y = y;
        this.type = BoxType.ENVELOPE;
    }

    public Box (int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.type = BoxType.USUAL_BOX;

        if (this.x == this.y && this.x == this.z) {
            this.type = BoxType.CUBE;
        }
    }

    public BoxType getType() {
        return type;

    }
}



