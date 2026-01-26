
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author MatheusPC
 */
public class TodoList {

    private ArrayList<String> tasksList;

    public TodoList() {
        this.tasksList = new ArrayList<>();
    }

    public void add(String tasks) {
        if (tasks.isEmpty()) {
            return;
        }

        this.tasksList.add(tasks);

    }

    public void print() {
        for (int i = 0; i < this.tasksList.size(); i++) {
            System.out.println((i + 1) + ": " + this.tasksList.get(i));
        }
    }

    public void remove(int number) {
        this.tasksList.remove(number - 1);
    }

}
