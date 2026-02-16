
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container liquid1 = new Container();
        Container liquid2 = new Container();

        while (true) {
            System.out.println("First: " + liquid1);
            System.out.println("Second: " + liquid2);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            if (command.equals("move")) {
                liquid1.move(liquid2, amount);
            }
            if (command.equals("add")) {
                liquid1.add(amount);
            }
            if (command.equals("remove")) {
                liquid2.remove(amount);
            }

        }

    }
}
