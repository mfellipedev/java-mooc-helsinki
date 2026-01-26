
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

    public UserInterface(TodoList list, Scanner scanner) {
        this.scanner = scanner;
        this.task = list;
    }

    public void start() {
        while (true) {
            System.out.println("Command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            }

            processCommand(command);
        }
    }

    public void processCommand(String command) {
        if (command.equals("add")) {
            add();
        }

        if (command.equals("remove")) {
            remove();
        }
        
        if (command.equals("list")) {
            list();
        }
    }

    public void add() {
        System.out.println("To add: ");
        String toAdd = scanner.nextLine();

        this.task.add(toAdd);
        System.out.println("");

    }

    public void list() {
        this.task.print();
    }

    public void remove() {

        System.out.println("Which one is removed? ");
        String command = scanner.nextLine();
        int id = Integer.valueOf(command);
        this.task.remove(id);
    }

}
