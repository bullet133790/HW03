import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type any word");
        String word = scanner.nextLine();
        char lastChar = getLastChar(word);
        System.out.println("Result = " + lastChar);



    }



public static char getLastChar(String input){
        return input.charAt(input.length() - 1);
}

}
