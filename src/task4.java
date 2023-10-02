import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write any word");
        String word = scanner.nextLine();
        char firstChar = word.charAt(0); // take first char
        char lastChar = word.charAt(word.length() - 1);  // take the last char
        String result = lastChar + word.substring(1, word.length() - 1) + firstChar; //lastChar + (removes the first and last characters from the word ) + firstChar
        System.out.println("Result " + result);


    }



}
