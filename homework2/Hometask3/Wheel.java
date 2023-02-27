package java_hometasks.homework2.Hometask3;

public enum Wheel {
    SIZE1 (17),
    SIZE2(18),
    SIZE3(19),
    ;
    int wheelSize;

    Wheel(int wheelSize) {
        this.wheelSize = wheelSize;

    }

    public int getWheelSize() {
        return wheelSize;
    }
}
