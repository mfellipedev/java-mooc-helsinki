
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

    private TodoList task;
    private Scanner scanner;

    public UserInterface(TodoList task, Scanner scanner) {
        this.scanner = scanner;
        this.task = task;
    }

    public void start() {
        while (true) {
            System.out.println("Command: ");
            String command = scanner.nextLine();
            if (command.equals("stop")) {
                break;
            } else if (command.equals("add")) {
                System.out.println("To add: ");
                String toAdd = scanner.nextLine();
                task.add(toAdd);
            } else if (command.equals("list")) {
                task.print();
            } else if (command.equals("remove")) {
                System.out.println("Which one is removed?");
                String remove = scanner.nextLine();
                int index = Integer.valueOf(remove);
                task.remove(index);
            }
        }
    }

}
