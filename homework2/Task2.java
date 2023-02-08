package java_hometasks.homework2;

public class Task2 {

    public static void main(String[] args) {
        Box unknownBox = new Box();
        unknownBox.x = 10;
        unknownBox.y = 12;
        unknownBox.z = 0;

        System.out.println(unknownBox.displayTypeOfBox());

        Box unknownBox1 = new Box(1, 2, 3);
        Box unknownBox2 = new Box(1);
        Box unknownBox3 = new Box(1, 2);

    }
}
