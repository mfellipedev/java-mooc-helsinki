/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MatheusPC
 */
import java.util.Scanner;

public class TextUI {

    private Scanner scanner;
    private SimpleDictionary simpleDictionary;

    public TextUI(Scanner scanner, SimpleDictionary simpleDictionary) {
        this.scanner = scanner;
        this.simpleDictionary = simpleDictionary;
    }

    public void start() {

        while (true) {
            System.out.println("Command:");
            String command = scanner.nextLine();

            if (command.equals("end")) {
                break;
            }
            processCommand(command);
            System.out.println("");
        }
        System.out.println("Bye Bye!");
    }

    public void processCommand(String command) {
        if (command.equals("add")) {
            add();
        } else if (command.equals("search")) {
            search();
        } else {
            System.out.println("Unknow command");
        }
    }

    public void add() {
        System.out.println("Word: ");
        String word = scanner.nextLine();

        System.out.println("Translation: ");
        String translation = scanner.nextLine();

        this.simpleDictionary.add(word, translation);
    }

    public void search() {
        System.out.println("To be translated:");
        String toBetranslated = scanner.nextLine();

        if (this.simpleDictionary.translate(toBetranslated) == null) {
            System.out.println("Word " + toBetranslated + " was not found");
        } else {
            System.out.println(this.simpleDictionary.translate(toBetranslated));
        }

    }
}
