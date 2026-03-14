
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        while (true) {
            Integer n = scanner.nextInt();
            scanner.nextLine();
            if (n < 0) {
                break;
            }
            numbers.add(n);
        }
        
        numbers.stream()
                .filter(number -> number > 0 && number < 6)
                .forEach(number -> System.out.println(number));
    }
}
