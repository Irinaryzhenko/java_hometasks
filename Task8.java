package java_hometasks2;

import java.util.regex.Pattern;

public class Task8 {
    public static void main(String[] args) {
        String someText = "Сustomer's card number 4433-1234-4321-4565";
        String[] words = someText.split(" ");
        String regExp = "[0-9]{4}-[0-9]{4}-[0-9]{4}-[0-9]{4}";

        for(String word : words){
            if (word.matches(regExp)) {
                String cardNumber = word.substring(0,19);
                System.out.println(cardNumber);











            }
        }




    }
}
