import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type any word");
        String word = scanner.nextLine();
        char firstChar = getFirstChar(word);
        System.out.println("Result = " + firstChar);


    }

// input.charAt(0) returns the first character (0 means first character)
    public static char getFirstChar(String input) {
     return input.charAt(0);

    }
}
