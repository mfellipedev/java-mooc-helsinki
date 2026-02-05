
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        DataBaseBirds control = new DataBaseBirds();

        while (true) {
            System.out.println("?");
            String command = scan.nextLine();
            if (command.equals("Quit")) {
                break;
            }
            processCommand(command, scan, control);
        }

    }

    public static void processCommand(String command, Scanner scan, DataBaseBirds control) {
        switch (command) {
            case "Add":
                System.out.println("Name: ");
                String name = scan.nextLine();
                System.out.println("Name in Latin: ");
                String latin = scan.nextLine();
                control.add(name, latin);
                break;
            case "Observation":
                System.out.println("Bird?");
                String bird = scan.nextLine();
                boolean exist = control.observation(bird);
                if (exist == false) {
                    System.out.println("Not a bird!");
                }
                break;
            case "All":
                for (Bird birds : control.all()) {
                    System.out.println(birds);
                }
                break;
            case "One":
                System.out.println("Bird?");
                String nameSearched = scan.nextLine();
                System.out.println(control.one(nameSearched));
                break;

        }
    }

}
