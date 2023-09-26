import java.lang.reflect.Parameter;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        int first = scanner.nextInt();
        System.out.println("Enter the second number");
        int second = scanner.nextInt();

        int result = absoluteDifference(first,second);
        System.out.println("Result " + result );






    }

        public static int absoluteDifference(int first, int second) {
        return Math.abs(first - second);





}


}
