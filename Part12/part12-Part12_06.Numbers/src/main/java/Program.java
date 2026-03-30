
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random lucky = new Random();

        System.out.println("How many random numbers should be printed?");
        String quantity = scanner.nextLine();
        for (int i = 0; i < Integer.valueOf(quantity); i++) {
            System.out.println(lucky.nextInt(11));
        }
    }

}
