import java.util.Scanner;

public class Homework3 {

        public static void main(String[] args) {
            Homework3 homework = new Homework3();
            //1
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the first number");
            int first = scanner.nextInt();
            System.out.println("Enter the second number");
            int second = scanner.nextInt();
            int result = homework.absoluteDifference(first,second);
            System.out.println("Result " + result );
            //2
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Type any word");
            String word = scanner2.nextLine();
            char firstChar = homework.getFirstChar(word);
            System.out.println("Result = " + firstChar);
            //3
            Scanner scanner3 = new Scanner(System.in);
            System.out.println("Type any word");
            String word3 = scanner3.nextLine();
            char lastChar = homework.getLastChar(word3);
            System.out.println("Result = " + lastChar);
            //4
            Scanner scanner4 = new Scanner(System.in);
            System.out.println("Write any word");
            String word4 = scanner4.nextLine();
            String swappedWord = homework.swapFirstAndLastCharacters(word4);
            System.out.println("Result " + swappedWord);


        }
//1
        public  int absoluteDifference(int first, int second) {
            return Math.abs(first - second);
//2
        }
    public  char getFirstChar(String word) {
        return word.charAt(0);
    }
//3
    public  char getLastChar(String word) {
        return word.charAt(word.length() - 1);
    }

//4
    public String swapFirstAndLastCharacters (String word){
            return word.charAt(word.length() - 1) + word.substring(1, word.length() - 1) + word.charAt(0);

    }





}
