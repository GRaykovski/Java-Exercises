package main;

import java.nio.charset.StandardCharsets;
import java.util.Random;

public class RandomString {

    public static String getRandomString(int length) {
        byte[] array = new byte[1024];
        new Random().nextBytes(array);

        String randomString = new String(array, StandardCharsets.UTF_8);

        StringBuilder createdString = new StringBuilder();

        for (int k = 0, i = 0; k < length; k++) {
            char ch;
            do {
                ch = randomString.charAt(i++);
            } while (!Character.isAlphabetic(ch) && !Character.isDigit(ch) && i < 1024);

            createdString.append(ch);
        }

        return createdString.toString();
    }

    public static void main(String[] args) {
        System.out.println(getRandomString(10));
    }

}

