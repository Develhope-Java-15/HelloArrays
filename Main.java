import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        String name = "Giuseppino";

        char[] charArray = name.toCharArray();

        System.out.println("Array: " + Arrays.toString(charArray));
        System.out.println("Penultima lettera: " + charArray[charArray.length - 2]);
    }
}