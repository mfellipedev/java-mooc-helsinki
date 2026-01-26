
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author MatheusPC
 */
public class UserInterface {

    private JokeManager manager;
    private Scanner scanner;

    public UserInterface(JokeManager manager, Scanner scanner) {
        this.manager = manager;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.println("Commands: \n1- add a joke \n2- draw a joke \n3- list jokes \nX- stop");
            String command = scanner.nextLine();
            if (command.isEmpty()) {
                return;
            }
            if (command.equals("X")) {
                break;
            }
            processCommand(command);

        }
    }

    public void processCommand(String command) {

        if (command.equals("1")) {
            System.out.println("Write the joke to be added:");
            String add = scanner.nextLine();
            this.manager.addJoke(add);
        }
        if (command.equals("2")) {
            System.out.println(this.manager.drawJoke());
        }
        if (command.equals("3")) {
            System.out.println("Printing the jokes.");
            this.manager.printJokes();
        }
    }

}
